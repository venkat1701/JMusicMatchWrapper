package com.venkat.musixmatch.tracks;

import com.google.gson.annotations.SerializedName;

import com.venkat.musixmatch.tracks.lyrics.Lyrics;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Venkat.
 * @since 1.0
 * Contains all possible parameters the Body of the response can contain.
 */
public class TrackBody {

    @SerializedName("track")
    @Getter @Setter
    private TrackInfo trackInfo;

    @SerializedName("track_list")
    @Getter @Setter
    private List<Track> tracksList;

    @SerializedName("lyrics")
    @Getter @Setter
    private Lyrics lyrics;
}
