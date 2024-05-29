package com.fish.anr_seafoods_erp.dto.response;

import java.util.List;

public class ErrorResponse {
    private String errorMessage;
    private int errorCode;
    private List<String> errors;

    public ErrorResponse(String errorMessage, int errorCode) {
        this.errorMessage=errorMessage;
        this.errorCode=errorCode;
    }
}
