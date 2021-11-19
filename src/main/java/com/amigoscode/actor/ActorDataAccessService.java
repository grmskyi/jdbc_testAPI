package com.amigoscode.actor;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ActorDataAccessService implements ActorDao{

    private final JdbcTemplate jdbcTemplate;

    public ActorDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertActors(Actor actor) {
        var sql = """
                INSERT INTO actor(name) 
                VALUES (?)
                """;
        return jdbcTemplate.update(sql,actor.name());
    }
}
