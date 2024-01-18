package br.com.univali.webfluxcourse.model.request;

public record UserRequest(
        String name,
        String email,
        String passaword
) {

}
