package com.apiAudiovisual.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int genreId;

    @Column(name = "genre", nullable = false)
    private String genre;

    @OneToOne(mappedBy = "genre1")
    private MediaRecord record;

    @OneToOne(mappedBy = "genre2")
    private MediaRecord record2;

    public Genre() {
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public MediaRecord getRecord() {
        return record;
    }

    public void setRecord(MediaRecord record) {
        this.record = record;
    }
}
