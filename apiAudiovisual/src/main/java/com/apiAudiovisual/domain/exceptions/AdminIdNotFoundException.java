package com.apiAudiovisual.domain.exceptions;

public class AdminIdNotFoundException extends RuntimeException {

    public AdminIdNotFoundException(String message){
        super(message);
    }
}
