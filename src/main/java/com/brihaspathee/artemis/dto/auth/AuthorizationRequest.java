package com.brihaspathee.artemis.dto.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 10, April 2025
 * Time: 14:25
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizationRequest {

    /**
     * Represents the URI of the resource that is being accessed or requested.
     * The resource URI is subject to the following validation constraints:
     * - It cannot be null.
     * - It cannot be blank (must contain non-whitespace characters).
     */
    @NotNull(message = "Resource URI cannot be null")
    @NotBlank(message = "Resource URI cannot be blank")
    private String resourceUri;
}
