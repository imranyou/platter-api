package com.patter.controller;


import com.google.gson.Gson;
import com.patter.Application;
import com.patter.entities.Idea;
import com.patter.repos.IdeaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class IdeaController {
    private static final Logger log = LoggerFactory.getLogger(IdeaController.class);

    @Autowired
    private IdeaRepository repository;

    @Autowired
    private Gson gson;

    @RequestMapping(value = "/idea")
    public String getAllIdeas(){
        List<Idea> allIdeas = new ArrayList<>();
        for(Idea idea : repository.findAll()){
            allIdeas.add(idea);
        }
        return gson.toJson(allIdeas);
    }

    @RequestMapping(value = "/idea/id/{id}")
    public String getIdeaByID(@PathVariable(value="id") Long id){
        Idea idea = repository.findById(id);
        return gson.toJson(idea);
    }


    @RequestMapping(value = "/idea/user/{user_id}")
    public String getIdeaByUser(@PathVariable(value="user_id") Integer user_id){
        List<Idea> idea = repository.findByUserKey(user_id);
        return gson.toJson(idea);
    }



}
