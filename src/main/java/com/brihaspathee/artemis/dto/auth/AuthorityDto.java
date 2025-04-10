package com.brihaspathee.artemis.dto.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, April 2025
 * Time: 05:53
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityDto {

    /**
     * Represents the permission associated with a particular authority.
     * The permission is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must have a minimum length of 2 characters.
     */
    @NotNull(message = "Permission cannot be null")
    @NotBlank(message = "Permission cannot be blank")
    @Size(min = 2, message = "Permission must be at least 2 characters long")
    private String permission;
}
