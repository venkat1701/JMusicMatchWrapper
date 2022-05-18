package com.venkat.musixmatch.util.ext;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericExtractor{
    @SerializedName("message")
     @Setter
    private GenericContainer container;

    public GenericExtractor() {}

    public GenericExtractor(GenericContainer container) {
        this.container = container;
    }


    public GenericContainer getContainer() {
        return container;
    }

}
