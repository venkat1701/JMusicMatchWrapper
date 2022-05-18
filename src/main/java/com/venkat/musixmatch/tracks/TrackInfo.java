package com.venkat.musixmatch.tracks;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Venkat.
 * @since 1.0
 * Contains all the Track Info of the Tracks.
 *
 */
@Getter @Setter
public class TrackInfo {

    @SerializedName("track_id")
    private String trackId;

    @SerializedName("track_name")
    private String trackName;

    @SerializedName("track_rating")
    private String trackRating;

    @SerializedName("commontrack_id")
    private String commontrackId;

    @SerializedName("has_lyrics")
    private String hasLyrics;

    @SerializedName("has_subtitles")
    private String hasSubtitles;

    @SerializedName("album_id")
    private String albumID;

    @SerializedName("album_name")
    private String albumName;

    @SerializedName("artist_id")
    private String artistID;

    @SerializedName("artist_name")
    private String artistName;

    @Override
    public String toString() {
        return "TrackInfo{" +
                "trackId='" + trackId + '\'' +
                ", trackName='" + trackName + '\'' +
                ", trackRating='" + trackRating + '\'' +
                ", commontrackId='" + commontrackId + '\'' +
                ", hasLyrics='" + hasLyrics + '\'' +
                ", hasSubtitles='" + hasSubtitles + '\'' +
                ", albumID='" + albumID + '\'' +
                ", albumName='" + albumName + '\'' +
                ", artistID='" + artistID + '\'' +
                ", artistName='" + artistName + '\'' +
                ", trackShareUrl='" + trackShareUrl + '\'' +
                '}';
    }

    @SerializedName("track_share_url")
    private String trackShareUrl;

}
