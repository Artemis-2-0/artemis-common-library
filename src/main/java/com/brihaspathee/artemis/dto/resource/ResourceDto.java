package com.brihaspathee.artemis.dto.resource;

import com.brihaspathee.artemis.dto.auth.AuthorityDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, April 2025
 * Time: 05:51
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.dto.resource
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceDto {

    /**
     * Represents the unique identifier for a specific resource.
     * This identifier is used to distinguish the resource within the system.
     */
    private String resourceId;

    /**
     * Represents the name of the resource.
     * This field is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must have a minimum length of 3 characters.
     */
    @NotNull(message = "Resource name cannot be null")
    @NotBlank(message = "Resource name cannot be blank")
    @Size(min = 3, message = "Resource name should be at least 3 characters")
    private String resourceName;

    /**
     * Represents the type of a resource in the system.
     * The resource type is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must have a minimum length of 3 characters.
     */
    @NotNull(message = "Resource type cannot be null")
    @NotBlank(message = "Resource type cannot be blank")
    @Size(min = 3, message = "Resource type should be at least 3 characters")
    private String resourceType;

    /**
     * Represents the description of a resource in the system.
     * The resource description is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must have a minimum length of 3 characters.
     */
    @NotNull(message = "Resource description cannot be null")
    @NotBlank(message = "Resource description cannot be blank")
    @Size(min = 3, message = "Resource description should be at least 3 characters")
    private String resourceDescription;

    /**
     * Represents the URI of a resource in the system.
     * The resource URI is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must be at least 3 characters in length.
     */
    @NotNull(message = "Resource URI cannot be null")
    @NotBlank(message = "Resource URI cannot be blank")
    @Size(min = 3, message = "Resource URI should be at least 3 characters")
    private String resourceUri;

    /**
     * Represents the owner of a resource in the system.
     * The resource owner is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     * - It must have a minimum length of 3 characters.
     */
    @NotNull(message = "Resource owner cannot be null")
    @NotBlank(message = "Resource owner cannot be blank")
    @Size(min = 3, message = "Resource owner should be at least 3 characters")
    private String resourceOwner;

    /**
     * Represents the list of authorities associated with a resource.
     * Each authority in the list is represented as an instance of {@code AuthorityDto}.
     * The list is subject to the following validation constraints:
     * - It cannot be null.
     * - It must contain at least one authority.
     */
    @NotNull(message = "Authorities cannot be null")
    @Size(min = 1, message = "At least one authority must be specified")
    private List<AuthorityDto> authorities;
}
