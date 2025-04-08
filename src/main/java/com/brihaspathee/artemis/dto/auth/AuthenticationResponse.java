package com.brihaspathee.artemis.dto.auth;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 08, April 2025
 * Time: 13:29
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.dto.auth
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {

    /**
     * Represents the token generated as a result of successful authentication.
     * This token is typically used for subsequent authorization and authentication purposes.
     */
    private String token;
}
