package br.com.univali.webfluxcourse.service;

import br.com.univali.webfluxcourse.entity.User;
import br.com.univali.webfluxcourse.mapper.UserMapper;
import br.com.univali.webfluxcourse.model.request.UserRequest;
import br.com.univali.webfluxcourse.respository.Userrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final Userrepository userRepository;
    private final UserMapper userMapper;
    public Mono<User> save(final UserRequest userRequest){
        return userRepository.save(userMapper.toEntity(userRequest));
    }
}
