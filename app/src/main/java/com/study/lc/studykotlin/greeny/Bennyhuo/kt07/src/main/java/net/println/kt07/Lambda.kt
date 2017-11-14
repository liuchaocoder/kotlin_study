package net.println.kt07

import rx.Observable
import java.io.File
import java.util.concurrent.Executors

fun main(args: Array<String>) {
    val text = File(ClassLoader.getSystemResource("input").path).readText()//kotlin对readText方法
    Observable.from(text.toCharArray().asIterable()).filter { !it.isWhitespace() }.groupBy { it }.subscribe {
        //1.toChartArray返回对是CharArray类型，调用asIterable转为集合类型
        //2.filter进行过滤
        //3.groupBy进行分组
        //4.新的变量o
        o -> o.count().subscribe{
            println("${o.key} -> $it")
        }
    }
}




