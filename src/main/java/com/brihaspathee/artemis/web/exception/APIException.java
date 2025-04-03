package com.brihaspathee.artemis.web.exception;

import lombok.*;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 03, April 2025
 * Time: 5:29 PM
 * Project: artemis
 * Package Name: com.brihaspathee.artemis.web.exception
 * To change this template use File | Settings | File and Code Template
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class APIException {

    /**
     * Represents the error code associated with an exception.
     * This code is used to classify and identify the nature of the error
     * that occurred in the application.
     */
    private String errorCode;

    /**
     * Represents the detailed error message associated with an exception.
     * This message provides additional context or description
     * about the error encountered during the execution of the application.
     */
    private String errorMessage;

    /**
     * Provides a string representation of the APIException instance,
     * including the errorCode and errorMessage.
     *
     * @return a string representation of the APIException object.
     */
    @Override
    public String toString() {
        return "APIException{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
