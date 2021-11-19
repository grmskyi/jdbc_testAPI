package com.amigoscode.actor;


import com.amigoscode.exception.NotFoundException;



import org.springframework.stereotype.Service;


@Service
public class ActorService {

    private final ActorDao actorDao;

    public ActorService(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    public void addNewActor(Actor actor){
        if(actor==null){
            throw  new NotFoundException("Actor dont found");
        }
        int result = actorDao.insertActors(actor);
        if (result != 1) {
            throw new IllegalStateException("oops something went wrong");
        }
    }
}
