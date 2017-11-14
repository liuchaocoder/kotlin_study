package com.study.lc.studykotlin.greeny.Bennyhuo.Kt10.src.main.java.net.println.kt10.java;

/**
 * Created by benny on 11/13/16.
 */
public class PlainOldSingleton {
    private static PlainOldSingleton INSTANCE = new PlainOldSingleton();

    private PlainOldSingleton(){
        System.out.println("PlainOldSingleton");
    }

    public static PlainOldSingleton getInstance(){
        return INSTANCE;
    }
}
