package com.apiAudiovisual.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_record")
public class UserRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    Person person;

    @ManyToOne
    @JoinColumn(name = "record_id")
    MediaRecord record;

    public UserRecord() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getUser() {
        return person;
    }

    public void setUser(Person person) {
        this.person = person;
    }

    public MediaRecord getRecord() {
        return record;
    }

    public void setRecord(MediaRecord record) {
        this.record = record;
    }
}
