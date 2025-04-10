package com.brihaspathee.artemis.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, April 2025
 * Time: 15:31
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    /**
     * Represents the username of the user.
     *
     * Validation Constraints:
     * - Cannot be null.
     * - Cannot be blank (must contain non-whitespace characters).
     * - Must be in a valid email address format.
     */
    @NotNull(message = "Username cannot be null")
    @NotBlank(message = "Username cannot be blank")
    private String username;

    /**
     * Represents the password associated with the user.
     *
     * Validation Constraints:
     * - The password cannot be null.
     * - The password cannot be blank (must contain non-whitespace characters).
     * - The password must have a minimum length of 8 characters.
     */
    @NotBlank(message = "Password cannot be blank")
    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    /**
     * Represents the roles assigned to the user. Each role is defined by the RoleDto class.
     * This field is subject to the following validation constraints:
     * - The list must contain at least one role.
     * - Each role in the list should adhere to the constraints defined in the RoleDto class.
     */
    @Size(min = 1, message = "User should have at lease on role")
    private List<RoleDto> roles;
}
