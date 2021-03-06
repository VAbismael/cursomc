package com.vinicius.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 2058823360443559913L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable causa){
        super(msg, causa);
    }
}
