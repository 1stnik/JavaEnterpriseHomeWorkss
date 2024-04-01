package com.hillel.task_management_system.exceptions;

public class UserExistsException extends RuntimeException{

    public UserExistsException(String message) {
        super(message);
    }

    public UserExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
