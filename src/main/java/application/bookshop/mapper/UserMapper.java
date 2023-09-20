package application.bookshop.mapper;

import application.bookshop.config.MapperConfig;
import application.bookshop.dto.userdto.UserResponseDto;
import application.bookshop.model.User;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    UserResponseDto toUserResponse(User user);
}
