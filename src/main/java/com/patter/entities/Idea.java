package com.patter.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by iyousuf.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Idea {

    private long id;

    private String title;

    private String description;

    private User user;
}
