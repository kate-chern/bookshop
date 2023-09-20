package application.bookshop.dto.userdto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserLoginRequestDto {
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String password;

}
