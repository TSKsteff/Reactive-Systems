package br.com.univali.webfluxcourse.mapper;

import br.com.univali.webfluxcourse.entity.User;
import br.com.univali.webfluxcourse.model.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest userRequest);
}
