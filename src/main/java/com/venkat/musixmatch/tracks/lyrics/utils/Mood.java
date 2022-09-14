package com.venkat.musixmatch.tracks.lyrics.utils;


import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

public class Mood {

    @SerializedName("label")
    @Setter @Getter
    private String label;

    @SerializedName("value")
    @Setter @Getter
    private double value;
}
