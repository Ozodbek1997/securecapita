package io.getarrays.securecapita.form;

import jakarta.validation.constraints.NotEmpty;
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
public class UpdatePasswordForm {
    @NotEmpty(message = "Current Password cannot be empty")
    private String currentPassword;
    @NotEmpty(message = "New password cannot be empty")
    private String newPassword;
    @NotEmpty(message = "Confirm password cannot be empty")
    private String confirmNewPassword;
}
