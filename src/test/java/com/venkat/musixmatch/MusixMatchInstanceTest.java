package com.venkat.musixmatch;


import com.venkat.musixmatch.exceptions.MusixException;
import com.venkat.musixmatch.tracks.Track;

public class MusixMatchInstanceTest {


    public static void main(String[] args)throws MusixException {
        MusixMatch instance = new MusixMatch("");

        instance.getTrackById("22");

    }
}
