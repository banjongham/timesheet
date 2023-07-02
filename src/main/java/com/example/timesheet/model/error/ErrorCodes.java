package com.example.timesheet.model.error;

public enum ErrorCodes {

    SY0001("Internal System Error"),

    DA0001("Data not found"),

    ER0001("Error");

    private String message;

    ErrorCodes(String message) { this.message = message; }

    public String getMessage() {
        return message;
    }
}
