package com.apiAudiovisual.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "content_type")
public class ContentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int contentTypeId;

    @Column(name = "type", nullable = false)
    private String type;

    @OneToMany(mappedBy = "contentType")
    private List<MediaRecord> records;


    public ContentType() {
    }

    public int getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(int contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
