package com.brihaspathee.artemis.dto.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, April 2025
 * Time: 15:33
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {

    @NotNull(message = "Role name cannot be null")
    @NotBlank(message = "Role name cannot be blank")
    @Size(min = 2, message = "Role name must be at least 2 characters long")
    private String roleName;

    /**
     * Represents a list of authorities associated with a role.
     * Each authority grants specific permissions and is represented by the AuthorityDto class.
     *
     * Validation Constraints:
     * - The list must contain at least one authority.
     * - Each authority in the list should adhere to the constraints defined in the AuthorityDto class.
     */
    @Size(min = 1, message = "There should at least one authority associated with the role")
    private List<AuthorityDto> authorities;
}
