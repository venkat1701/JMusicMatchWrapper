package com.venkat.musixmatch;


import com.venkat.musixmatch.exceptions.MusixException;
import com.venkat.musixmatch.tracks.Track;

public class MusixMatchInstanceTest {


    public static void main(String[] args)throws MusixException {
        MusixMatch instance = new MusixMatch("");


        System.out.println("HGemlp" + instance.getTrackById("118228581").getInfo());


//        System.out.println(instance.getTracksBySearch("Perfect", "Ed Sheeran"));
        for(Track info : instance.getTopHitsOfArtist("Ed Sheeran",1)){
            System.out.println(instance.getLyricsOfTrack(info.getInfo().getTrackId()).getLyricsBody());
        }

    }
}
