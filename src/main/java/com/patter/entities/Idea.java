package com.patter.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by iyousuf.
 */

@Entity
@Table(name = "IDEA")
public class Idea {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "IDEA_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "USER_KEY")
    private int user_key;

    protected Idea() {
    }

    public Idea(String title, String description, Integer user_key) {
        this.title = title;
        this.description = description;
        this.user_key = user_key;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user_key=" + user_key +
                '}';
    }
}
