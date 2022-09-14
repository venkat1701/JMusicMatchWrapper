package com.venkat.musixmatch.constants;

/**
 * Constants of Filter Query.
 *  @author Venkat.
 *  @since 1.0
 */
public enum FilteringConstants {
    F_HAS_LYRICS("f_has_lyrics"),
    F_IS_INSTRUMENTAL("f_is_instrumental"),
    F_HAS_SUBTITLE("f_has_subtitle"),
    API_KEY("apikey"),
    Q_TRACK("q_track"),
    QUERY("q"),
    Q_ARTIST("q_artist"),
    TRACK_ISRC("track_isrc"),
    API_URL("https://api.musixmatch.com/ws/"),
    API_VERSION("1.1"),
    API_DELIM("/"),
    TRACK_ID("track_id"),
    Q_LYRICS("q_lyrics");


    private String name;

    FilteringConstants(String name){
        this.name = name;
    }

    public String get(){
        return this.name;
    }
}
