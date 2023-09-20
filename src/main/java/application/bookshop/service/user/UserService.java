package application.bookshop.service.user;

import application.bookshop.dto.userdto.UserRegistrationRequest;
import application.bookshop.dto.userdto.UserResponseDto;
import application.bookshop.exception.RegistrationException;

public interface UserService {
    UserResponseDto register(UserRegistrationRequest request) throws RegistrationException;
}
