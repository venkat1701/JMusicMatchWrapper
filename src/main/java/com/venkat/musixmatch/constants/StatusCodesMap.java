package com.venkat.musixmatch.constants;

import jdk.jshell.Snippet;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Generates a Map out of the StatusCodes class.
 * @author Venkat
 * @version 1.0
 */
public class StatusCodesMap {

    @Getter
    private static Map<Integer, String> statusCodesMap = Arrays.stream(StatusCodes.values()).collect(Collectors.toMap(StatusCodes::getCode, StatusCodes::getDesc));

    public static Map<Integer, String> getStatuscodesMap(){
        return statusCodesMap;
    }

}
