package com.venkat.musixmatch.util.ext;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * Stores the Parts of the JSON Response received from the Request.
 *
 * @author Venkat
 * @since 1.0
 */
public class GenericContainer {


    @SerializedName("body")
    @Setter
    @Getter
    private ResponseBodyHandler body;



}
