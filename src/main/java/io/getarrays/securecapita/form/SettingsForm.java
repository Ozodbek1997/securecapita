package io.getarrays.securecapita.form;

import jakarta.validation.constraints.NotNull;
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
public class SettingsForm {
    @NotNull(message = "Enabled cannot be null or empty")
    private Boolean enabled;
    @NotNull(message = "Not Locked cannot be null or empty")
    private Boolean notLocked;
}
