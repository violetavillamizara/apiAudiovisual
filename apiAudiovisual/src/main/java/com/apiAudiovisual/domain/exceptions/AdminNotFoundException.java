package com.apiAudiovisual.domain.exceptions;

public class AdminNotFoundException extends RuntimeException{

    public AdminNotFoundException(String message){
        super(message);
    }
}
