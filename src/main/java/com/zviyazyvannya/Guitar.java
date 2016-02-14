package com.zviyazyvannya;

import org.springframework.stereotype.Component;

/**
 * Created by Алексей on 11.02.2016.
 */
public class Guitar implements Instrument {
    public void play() {
        System.out.println("Strum strum strum");
    }
}

