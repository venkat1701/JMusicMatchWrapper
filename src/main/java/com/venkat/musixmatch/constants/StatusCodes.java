package com.venkat.musixmatch.constants;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * StatusCodes for Results.
 * @author Venkat.
 * @since 1.0
 */
public enum StatusCodes {

    OK(200, "The request was successful."),
    BAD_SYNTAX(400, "The request had bad syntax or was inherently impossible to be satisfied."),
    AUTH_FAIL(401, "Authentication failed, probably because of invalid/missing API key."),
    USAGE_LIMIT(402, "The usage limit has been reached, either you exceeded per day requests limits or your balance is insufficient."),
    UNAUTH(403, "You are not authorized to perform this operation."),
    NOT_FOUND_RES(404, "Requested Resource Not Found"),
    NOT_FOUND_MET(405, "Requested Method Not Found"),
    REQ_UNSATISFIED(503, "Our system is a bit busy at the moment and your request can’t be satisfied.");

    @Getter
    private int code;
    @Getter
    private String desc;

    StatusCodes(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
