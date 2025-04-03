package com.brihaspathee.artemis.web.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 03, April 2025
 * Time: 2:34 PM
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.web.response
 * To change this template use File | Settings | File and Code Template
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtemisAPIResponse<E> {

    /**
     * Represents the timestamp of the API response.
     * This field typically captures the date and time at which the response was generated,
     * providing a mechanism to track or record when the API operation occurred.
     */
    private LocalDateTime timestamp;

    /**
     * Represents the HTTP status code associated with the API response.
     * This field typically stores the numerical HTTP status code that indicates
     * the result of the HTTP request, such as 200 for success or 404 for not found.
     */
    private int statusCode;

    /**
     * Represents the HTTP status of the API response.
     * This field typically stores the HTTP status code and reason phrase
     * that indicate the outcome of the operation.
     */
    private HttpStatus status;

    /**
     * Represents the reason explaining the outcome or state of the API response.
     * This field is typically used to provide a brief description or explanation
     * for the response status, aiding in understanding the purpose or cause
     * behind the response.
     */
    private String reason;

    /**
     * Provides additional contextual or descriptive information about the API response.
     * This message can be tailored for end-users to communicate the result or outcome
     * of the API operation in a clear and concise manner.
     */
    private String message;

    /**
     * Contains additional technical details or information intended for developers.
     * This message can be used for debugging or logging purposes
     * and is not typically exposed to end-users.
     */
    private String developerMessage;

    /**
     * Represents the generic response payload of type E returned by the API.
     * This can be any object or data type specific to the API response structure.
     */
    private E response;
}
