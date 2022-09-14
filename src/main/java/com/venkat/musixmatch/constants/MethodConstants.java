package com.venkat.musixmatch.constants;

/**
 * Constants of Sending Requests to the API.
 * @author Venkat.
 * @since 1.0
 */
public enum MethodConstants {

    TRACK_SEARCH("track.search"),
    TRACK_GET("track.get"),
    TRACK_LYRICS_GET("track.lyrics.get"),

    TRACK_LYRICS_MOOD_GET("track.lyrics.mood.get");

    private String method;


    MethodConstants(String method){
        this.method = method;
    }

    public String get(){
        return this.method;
    }

}
