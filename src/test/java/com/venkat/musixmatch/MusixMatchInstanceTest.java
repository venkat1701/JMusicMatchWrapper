package com.venkat.musixmatch;


import com.venkat.musixmatch.exceptions.MusixException;
import com.venkat.musixmatch.tracks.Track;
import com.venkat.musixmatch.tracks.TrackInfo;
import com.venkat.musixmatch.tracks.lyrics.Lyrics;
import com.venkat.musixmatch.tracks.lyrics.utils.Mood;

import java.util.List;

public class MusixMatchInstanceTest {


    public static void main(String[] args)throws MusixException {
        MusixMatch instance = new MusixMatch("");

        // Fetching A Track from its ID.
        Track track = instance.getTrackById("2341560");
        TrackInfo info = track.getInfo();
        System.out.println(info);

        // Fetching Multiple Tracks at Once by Search.
        List<Track> tracks = instance.getTracksBySearch("Perfect", "Ed Sheeran", 2);
        System.out.println(tracks);

        // Fetching Multiple Popular tracks of an Artist
        List<Track> topHits = instance.getTopHitsOfArtist("Benny Dayal", 3);
        System.out.println(topHits);

        // Fetching Lyrics of a given Track.
        Lyrics lyrics = instance.getLyricsOfTrack("2341560");
        System.out.println(lyrics.getLyricsBody());

        // Fetching the MoodLists
//        List<Mood> moodList = instance.getMoodOfLyric("96657","127082996");
//        System.out.println(moodList);

    }
}
