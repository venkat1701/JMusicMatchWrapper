package com.venkat.musixmatch.util.ext;

import com.google.gson.annotations.SerializedName;

import com.venkat.musixmatch.tracks.Track;
import com.venkat.musixmatch.tracks.TrackInfo;
import com.venkat.musixmatch.tracks.lyrics.Lyrics;
import com.venkat.musixmatch.tracks.lyrics.LyricsMoodList;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Contains all possible parameters the Body of the response can contain.
 * @author Venkat.
 * @since 1.0
 */
public class ResponseBodyHandler {

    @SerializedName("track")
    @Getter @Setter
    private TrackInfo trackInfo;

    @SerializedName("track_list")
    @Getter @Setter
    private List<Track> tracksList;

    @SerializedName("lyrics")
    @Getter @Setter
    private Lyrics lyrics;

    @SerializedName("mood-list")
    @Getter @Setter
    private LyricsMoodList lyricsMoodList;
}
