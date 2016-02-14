package com.zviyazyvannya;

import java.util.Collection;

/**
 * Created by Алексей on 09.02.2016.
 */
public class OneManBand implements Performer{
    public OneManBand(){}
    public void perform(){
        for (Instrument instrument:instruments){
            instrument.play();
        }
    }
    private Collection<Instrument> instruments;
    public void setInstruments(Collection<Instrument> instruments){
        this.instruments = instruments;
    }
}

