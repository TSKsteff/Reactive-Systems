package br.com.univali.webfluxcourse.respository;

import br.com.univali.webfluxcourse.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class Userrepository {

    private ReactiveMongoTemplate mongoTemplate;

    public Mono<User> save(final User user){
        return mongoTemplate.save(user);
    }
}
