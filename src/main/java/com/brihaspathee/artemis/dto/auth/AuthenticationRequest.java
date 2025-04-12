package com.brihaspathee.artemis.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 08, April 2025
 * Time: 13:26
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {

    /**
     * Represents the username provided by the user attempting to authenticate.
     * The username is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must be a valid email address format.
     */
    @NotNull(message = "Username cannot be null")
    @NotBlank(message = "Username cannot be blank")
    @Email(message = "Username must be a valid email address")
    private String username;

    /**
     * Represents the password of the user attempting to authenticate.
     * The password is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must have a minimum length of 8 characters.
     */
    @NotNull(message = "Password cannot be null")
    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    /**
     * Represents the type of account for an authentication request.
     * The account type is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must have a minimum length of 3 characters.
     */
    @NotNull(message = "AccountType cannot be null")
    @NotBlank(message = "AccountType cannot be blank")
    @Size(min = 3, message = "AccountType must be at least three characters")
    private String accountType;

    /**
     * Returns a string representation of the AuthenticationRequest object.
     * The string includes the values of the username and password fields.
     *
     * @return a string containing the username and password values of the object
     */
    @Override
    public String toString() {
        return "AuthenticationRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
