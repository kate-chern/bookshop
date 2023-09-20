package application.bookshop.controller;

import application.bookshop.dto.userdto.UserLoginRequestDto;
import application.bookshop.dto.userdto.UserLoginResponseDto;
import application.bookshop.dto.userdto.UserRegistrationRequest;
import application.bookshop.dto.userdto.UserResponseDto;
import application.bookshop.exception.RegistrationException;
import application.bookshop.security.AuthenticationService;
import application.bookshop.service.user.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;
    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public UserLoginResponseDto login(@RequestBody UserLoginRequestDto request) {
        return authenticationService.authenticate(request);
    }

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody @Valid UserRegistrationRequest request)
            throws RegistrationException {
        return userService.register(request);
    }
}
