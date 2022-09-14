package com.venkat.musixmatch.tracks.lyrics;


import com.google.gson.annotations.SerializedName;
import com.venkat.musixmatch.tracks.lyrics.utils.Mood;
import com.venkat.musixmatch.util.ext.ResponseBodyHandler;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * LyricsMoodList to fetch the mood list of a particular Track.
 * @author Venkat.
 * @since 1.0
 * @see ResponseBodyHandler
 */
public class LyricsMoodList {

    @SerializedName("mood-list")
    @Getter
    @Setter
    private List<Mood> moodList;
}
