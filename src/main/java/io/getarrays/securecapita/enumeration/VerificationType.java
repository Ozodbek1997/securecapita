package io.getarrays.securecapita.enumeration;

/**
 * @author: Bek
 * since: 05/27/2023
 * Time: 11:30 AM
 * Project Name: securecapita
 */
public enum VerificationType {
    ACCOUNT("ACCOUNT"),
    PASSWORD("PASSWORD");

    private final String type;

    VerificationType(String type) { this.type = type; }

    public String getType() {
        return this.type.toLowerCase();
    }
}
