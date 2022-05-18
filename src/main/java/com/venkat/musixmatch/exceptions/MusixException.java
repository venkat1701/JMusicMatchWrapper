package com.venkat.musixmatch.exceptions;


/**
 * @author Venkat.
 * @since 1.0
 * Wraps all other Exceptions and makes it informative.
 */
public class MusixException extends Throwable{

    public MusixException(String message) {
        super(message);
    }
}
