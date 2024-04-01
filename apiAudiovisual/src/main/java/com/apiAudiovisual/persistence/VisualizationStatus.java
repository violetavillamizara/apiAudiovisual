package com.apiAudiovisual.persistence;

import jakarta.persistence.OneToMany;

public enum VisualizationStatus {
    PENDIENTE("pendiente", "falta por ver"),
    VIENDO("viendo", "viendo ahora"),
    TERMINADO("terminado", "ya finalizó"),
    ABANDONADO("abandonado", "no continuó"),
    EN_PAUSA("en pausa", "pausado");


    private String name;
    private String description;

    VisualizationStatus(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
