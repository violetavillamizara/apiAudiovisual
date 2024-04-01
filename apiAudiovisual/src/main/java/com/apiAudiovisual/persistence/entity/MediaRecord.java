package com.apiAudiovisual.persistence.entity;

import com.apiAudiovisual.persistence.VisualizationStatus;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "record")
public class MediaRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int recordId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "visualization_status")
    @Enumerated(EnumType.STRING)
    private VisualizationStatus visualizationStatus; // Change the type to VisualizationStatus

    @Column(name = "qualification")
    private float qualification;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "content_type_id")
    private ContentType contentType;

    @OneToOne
    @JoinColumn(name = "genre1")
    private Genre genre1;

    @OneToOne
    @JoinColumn(name = "genre2")
    private Genre genre2;

    @ManyToOne
    @JoinColumn(name = "platform_id")
    private Platform platform;

    @OneToMany(mappedBy = "record")
    Set<UserRecord> registrations;

    // Constructors and other methods...

    public VisualizationStatus getVisualizationStatus() {
        return visualizationStatus;
    }

    public void setVisualizationStatus(VisualizationStatus visualizationStatus) {
        this.visualizationStatus = visualizationStatus;
    }

    public float getQualification() {
        return qualification;
    }

    public void setQualification(float qualification) {
        this.qualification = qualification;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Genre getGenre1() {
        return genre1;
    }

    public void setGenre1(Genre genre1) {
        this.genre1 = genre1;
    }

    public Genre getGenre2() {
        return genre2;
    }

    public void setGenre2(Genre genre2) {
        this.genre2 = genre2;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
}
