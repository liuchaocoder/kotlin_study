package net.println.kt01

/**
 * Created by benny on 10/11/16.
 */

fun main(args: Array<out String>) {//1.fun代表方法2.参数：类型3.out类型java中extends4.Array代表数组
    println("Hello World!!")
    println(Bean("Bennyhuo", 0))//对象不需要new关键字
}

class Bean(val title: String, val id: Int) {
    //1／定义对象使用class 2.val 声明的是对象的属性
    override fun toString(): String {//1.默认已经复写toString，这里进行override
        return "$id - $title"//$模版方法
    }
}