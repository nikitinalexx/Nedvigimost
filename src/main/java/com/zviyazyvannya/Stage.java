package com.zviyazyvannya;

/**
 * Created by Алексей on 09.02.2016.
 */
public class Stage {
    private Stage(){}
    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }
    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}

