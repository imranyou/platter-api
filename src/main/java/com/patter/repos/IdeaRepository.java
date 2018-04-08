package com.patter.repos;

import com.patter.entities.Idea;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IdeaRepository extends CrudRepository<Idea, Long> {

    List<Idea> findById(Long id);

    List<Idea> findByTitle(String title);

}
