package com.example.repository;

import com.example.entity.People;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PeopleRepository implements PanacheMongoRepository<People> {


    public String getName(People people) {
        return people.getName();
    }

    public String getGreeting(People people) {
        return people.getGreeting();
    }
}
