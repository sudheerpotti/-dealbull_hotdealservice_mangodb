package com.dealbab.exception;

public class HotDealNotFoundException extends RuntimeException {

    private Integer errorMessage;

    public HotDealNotFoundException(Integer id){
        this.errorMessage = id;
    }

    public Integer getErrorMessage() {
        return errorMessage;
    }

} 
