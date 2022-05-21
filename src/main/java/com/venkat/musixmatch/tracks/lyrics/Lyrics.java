package com.venkat.musixmatch.tracks.lyrics;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * Lyrics class contains the Information of Lyrics about a Particular Track.
 * @author Venkat.
 * @since 1.0
 * @see com.venkat.musixmatch.tracks.TrackInfo
 */
public class Lyrics {

    @SerializedName("lyrics_id")
    @Getter
    @Setter
    private String lyricsId;

    @SerializedName("instrumental")
    @Getter @Setter
    private String instrumental;

    @SerializedName("lyrics_body")
    @Getter @Setter
    private String lyricsBody;

    @SerializedName("lyrics_copyright")
    @Getter @Setter
    private String copyrights;

    @SerializedName("lyrics_language")
    @Getter @Setter
    private String language;
}
