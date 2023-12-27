package io.getarrays.securecapita.service;

import io.getarrays.securecapita.enumeration.VerificationType;

/**
 * @author: Bek
 * since: 05/27/2023
 * Time: 11:30 AM
 * Project Name: securecapita
 */

public interface EmailService {
    void sendVerificationEmail(String firstName, String email, String verificationUrl, VerificationType verificationType);
}
