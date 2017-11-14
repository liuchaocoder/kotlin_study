package net.println.kt02

/**
 * Created by benny on 10/11/16.
 */

fun main(args : Array<out String>){
    println("Hello World!!!")
    println(Bean(0, "bennyhuo"))
}

data class Bean(val id : Int, val name: String)//data class

