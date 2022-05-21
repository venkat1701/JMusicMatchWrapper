package com.venkat.musixmatch.exceptions;


/**
 * Wraps all other Exceptions and makes it informative.
 * @author Venkat.
 * @since 1.0
 */
public class MusixException extends Throwable{

    public MusixException(String message) {
        super(message);
    }
}
