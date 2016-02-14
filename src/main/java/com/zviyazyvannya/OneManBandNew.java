package com.zviyazyvannya;

import java.util.Map;

/**
 * Created by Алексей on 09.02.2016.
 */
public class OneManBandNew implements Performer{
    public OneManBandNew(){}
    public void perform(){
        for (String key: instruments.keySet()){
            System.out.println(key+ " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
    private Map<String, Instrument> instruments;
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}

