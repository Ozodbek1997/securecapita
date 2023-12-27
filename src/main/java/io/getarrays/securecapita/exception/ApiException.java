package io.getarrays.securecapita.exception;
/**
 * @author: Bek
 * since: 05/27/2023
 * Time: 11:30 AM
 * Project Name: securecapita
 */
public class ApiException extends RuntimeException {
    public ApiException(String message) { super(message); }
}
