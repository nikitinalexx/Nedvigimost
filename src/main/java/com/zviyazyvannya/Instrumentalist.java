package com.zviyazyvannya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ������� on 09.02.2016.
 */

public class Instrumentalist implements Performer{
    public Instrumentalist() {}
    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
    private String song;
    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }
    private Instrument instrument;
    @Autowired
    @Qualifier("guitar")
    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }
}

