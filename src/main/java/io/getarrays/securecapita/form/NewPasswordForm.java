package io.getarrays.securecapita.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: Bek
 * since: 05/27/2023
 * Time: 11:30 AM
 * Project Name: securecapita
 */
@Getter
@Setter
public class NewPasswordForm {
    @NotNull(message = "ID cannot be null or empty")
    private Long userId;
    @NotEmpty(message = "Password cannot be empty")
    private String password;
    @NotEmpty(message = "Confirm password cannot be empty")
    private String confirmPassword;
}
