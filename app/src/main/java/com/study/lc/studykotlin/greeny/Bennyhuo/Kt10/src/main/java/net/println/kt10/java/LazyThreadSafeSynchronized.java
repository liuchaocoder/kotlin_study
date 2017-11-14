package com.study.lc.studykotlin.greeny.Bennyhuo.Kt10.src.main.java.net.println.kt10.java;

/**
 * Created by benny on 11/13/16.
 */
public class LazyThreadSafeSynchronized {
    private static LazyThreadSafeSynchronized INSTANCE;

    private LazyThreadSafeSynchronized(){}

    public static synchronized LazyThreadSafeSynchronized getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyThreadSafeSynchronized();
        }
        return INSTANCE;
    }
}
