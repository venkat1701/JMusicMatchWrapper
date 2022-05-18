package com.venkat.musixmatch.constants;

/**
 * @author Venkat.
 * @since 1.0
 * Constants of Sending Requests to the API.
 */
public enum MethodConstants {

    TRACK_SEARCH("track.search"),
    TRACK_GET("track.get"),
    TRACK_LYRICS_GET("track.lyrics.get");

    private String method;


    MethodConstants(String method){
        this.method = method;
    }

    public String get(){
        return this.method;
    }

}
