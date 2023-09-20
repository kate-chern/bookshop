package application.bookshop.dto.userdto;

import application.bookshop.validation.FieldMatch;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@FieldMatch(field = "password", fieldMatch = "repeatPassword",
        message = "Password and repeatPassword fields are not matching")
@Data
public class UserRegistrationRequest {
    @NotBlank
    @Size(min = 4, max = 50)
    private String email;
    @NotBlank
    private String password;
    private String repeatPassword;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    private String shippingAddress;
}
