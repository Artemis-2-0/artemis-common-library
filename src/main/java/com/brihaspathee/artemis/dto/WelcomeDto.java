package com.brihaspathee.artemis.dto;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 08, April 2025
 * Time: 10:53
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.dto
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WelcomeDto {

    /**
     * Represents a textual message that can be used to convey information or greetings.
     */
    private String message;

    /**
     * Returns a string representation of the WelcomeDto object.
     * The string includes the value of the message field in a structured format.
     *
     * @return a string representation of the current WelcomeDto instance.
     */
    @Override
    public String toString() {
        return "WelcomeDto{" +
                "message='" + message + '\'' +
                '}';
    }
}
