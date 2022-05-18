package com.venkat.musixmatch;


import com.google.gson.Gson;
import com.venkat.musixmatch.constants.FilteringConstants;
import com.venkat.musixmatch.constants.MethodConstants;
import com.venkat.musixmatch.request.MusixRequestHandler;
import com.venkat.musixmatch.tracks.Track;
import com.venkat.musixmatch.tracks.lyrics.Lyrics;
import com.venkat.musixmatch.util.ext.GenericExtractor;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Venkat.
 * @since 1.0
 * <br>
 * MusixMatch class lets you use its methods to get music tracks and lyrics.
 * <br>
 * <li> Fetching the Track by ID</li>
 * <pre>
 * {@code
 *  MusixMatch instance = new MusixMatch("YOUR API KEY");
 *  Track track = instance.getTrackById(5920049);
 *  TrackInfo trackInfo = track.getInfo();
 *  System.out.println(trackInfo.toString());
 * }
 * </pre>
 */
public final class MusixMatch {

    private String apiKey;
    private Gson gson;

    private Map<String, Object> map;

    private GenericExtractor extractor;

    /**
     * @param apiKey API Key for working with the API.
     */
    public MusixMatch(String apiKey){
        this.apiKey = apiKey;
        this.map = new HashMap<>();
    }

    /**
     * Gets the Track by ID.
     * <pre>
     * {@code
     *  Track track = musixMatchInstance.getTrackById(5920049);
     * }
     * </pre>
     * @param id A unique track id for the music track.
     * @return The Music Track related to the unique track id.
     */
    @SneakyThrows
    public Track getTrackById(String id){
        this.gson = new Gson();
        Track track = new Track();
        this.map.put(FilteringConstants.API_KEY.get(), this.apiKey);
        this.map.put(FilteringConstants.TRACK_ID.get(), String.format("%s", Integer.parseInt(id)));

        String response = MusixRequestHandler.sendHttpRequest(MethodConstants.TRACK_GET, map);

        this.extractor = this.gson.fromJson(response, GenericExtractor.class);

        var container = extractor.getContainer().getBody();
        track.setInfo(container.getTrackInfo());
        this.gson = null;
        this.map = new HashMap<>();
        return track;
    }

    /**
     * Gets the Tracks by searching them filtering them from their Artist and Track Name sorted by Descending Order of their Ratings.
     * <pre>
     * {@code
     *  List<Track> tracksList = musixMatchInstance.getTracksBySearch("Perfect", "Ed Sheeran");
     * }
     * </pre>
     * @param q_track Track Name
     * @param q_artist Track Artist
     * @param number Number of Music Tracks to be filtered.
     * @return List of Tracks matching the Parameter Track and Artist.
     */
    @SneakyThrows
    public List<Track> getTracksBySearch(String q_track, String q_artist, int number) {
        this.gson = new Gson();
        this.map.put(FilteringConstants.API_KEY.get(), this.apiKey);
        this.map.put(FilteringConstants.Q_ARTIST.get(), q_artist);
        this.map.put(FilteringConstants.Q_TRACK.get(), q_track);
        this.map.put("page", 1);
        this.map.put("s_track_rating", "desc");
        this.map.put("page_size", number);


        String response = MusixRequestHandler.sendHttpRequest(MethodConstants.TRACK_SEARCH, map);

        var extractor = this.gson.fromJson(response, GenericExtractor.class);
        this.gson = null;
        this.map = new HashMap<>();
        return extractor.getContainer().getBody().getTracksList();
    }

    /**
     * Gets the Top Lyrics of Artists sorted in Descending order of their Ratings.
     * <pre>
     * {@code
     *  List<Track> topHits = musixMatchInstance.getTopHitsOfArtist("Ed Sheeran", 3);
     * }
     * </pre>
     * @param q_artist Name of Artist
     * @param number Number of Tracks required.
     * @return List of Tracks of Top Hits of the Artist.
     */
    @SneakyThrows
    public List<Track> getTopHitsOfArtist(String q_artist, int number) {
        this.gson = new Gson();
        this.map.put(FilteringConstants.API_KEY.get(), this.apiKey);
        this.map.put(FilteringConstants.Q_ARTIST.get(), q_artist);
        this.map.put("page", 1);
        this.map.put("page_size", number);
        this.map.put("s_track_rating", "desc");

        String response = MusixRequestHandler.sendHttpRequest(MethodConstants.TRACK_SEARCH, map);
        var extractor = this.gson.fromJson(response, GenericExtractor.class);
        this.gson = null;
        this.map = new HashMap<>();
        return extractor.getContainer().getBody().getTracksList();
    }

    /**
     * Gets the Lyrics of a Track by its Unique Track ID.
     * <pre>
     * {@code
     *  Lyrics lyrics = musixMatchInstance.getLyricsOfTrack("5920049");
     * }
     * </pre>
     * @param trackid Unique Track ID of the Music Track.
     * @return Returns the Lyrics of the Track.
     */
    @SneakyThrows
    public Lyrics getLyricsOfTrack(String trackid) {
        this.gson = new Gson();

        this.map.put(FilteringConstants.API_KEY.get(), this.apiKey);
        this.map.put(FilteringConstants.TRACK_ID.get(), trackid);

        String response = MusixRequestHandler.sendHttpRequest(MethodConstants.TRACK_LYRICS_GET, map);
        System.out.println(response);
        var extractor = this.gson.fromJson(response, GenericExtractor.class);
        this.gson = null;

        return extractor.getContainer().getBody().getLyrics();
    }

}
