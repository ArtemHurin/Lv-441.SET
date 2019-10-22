package com.academy.max.N2_Conditions.hw2_7;

public enum HttpErrors {

    E400("Bad Request"),
    E401("Unauthorized"),
    E402("Payment Required"),
    E403("Forbidden"),
    E404("Not Found"),
    E405("Method Not Allowed"),
    E406("Not Acceptable"),
    E407("Proxy Authentication Required"),
    E408("Request Timeout"),
    E409("Conflict"),
    E410("Gone"),
    E411("Length Required"),
    E412("Precondition Failed"),
    E413("Request Entity Too Large"),
    E414("Request-URI Too Long"),
    E415("Unsupported Media Type"),
    E416("Requested Range Not Satisfiable"),
    E417("Expectation Failed");

    private final String errorDescription;

    HttpErrors(String Description) {
        this.errorDescription = Description;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
}