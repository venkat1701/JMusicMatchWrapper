package com.venkat.musixmatch.tracks;


import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * Accesses status code for the Request.
 * @author Venkat
 * @since 1.0
 */
public class TrackHeader {


    @SerializedName("status_code")
    @Getter
    @Setter
    private int status;
}
