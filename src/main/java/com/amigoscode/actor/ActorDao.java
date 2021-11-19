package com.amigoscode.actor;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface ActorDao {
    int insertActors(Actor actor);
}
