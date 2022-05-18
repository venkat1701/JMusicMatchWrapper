package com.venkat.musixmatch.util.ext;

import com.google.gson.annotations.SerializedName;
import com.venkat.musixmatch.tracks.TrackBody;
import com.venkat.musixmatch.tracks.TrackInfo;
import lombok.Getter;
import lombok.Setter;

public class GenericContainer {


    @SerializedName("body")
    @Setter @Getter
    private TrackBody body;


    @SerializedName("null")
    @Setter @Getter
    private TrackInfo info;



    public GenericContainer(TrackBody body) {
        this.body = body;
    }


}
