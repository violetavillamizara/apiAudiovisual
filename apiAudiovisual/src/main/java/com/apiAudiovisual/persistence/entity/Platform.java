package com.apiAudiovisual.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "platform")
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int platformId;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "platform")
    private List<MediaRecord> records;

    public Platform() {
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
