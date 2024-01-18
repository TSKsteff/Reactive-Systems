package br.com.univali.webfluxcourse.model.response;

import org.springframework.data.mongodb.core.index.Indexed;

public record UserResponse(
        String id,
        String nome,
        String email,
        String password){}
