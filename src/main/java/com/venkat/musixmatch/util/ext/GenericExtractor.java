package com.venkat.musixmatch.util.ext;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * Breaks the API Response into a GenericContainer.
 *
 * @author Venkat.
 * @since 1.0
 */
@Getter
@Setter
public class GenericExtractor {
    @SerializedName("message")
    private GenericContainer container;

    public GenericExtractor(GenericContainer container) {
        this.container = container;
    }
}
