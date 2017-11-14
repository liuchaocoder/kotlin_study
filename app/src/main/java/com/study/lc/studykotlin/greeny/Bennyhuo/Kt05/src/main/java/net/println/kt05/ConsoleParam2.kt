package net.println.kt05

/**
 * a_b_c d_e f_g_h_j
 * a b c d e f g h j
 * Created by benny on 10/14/16.
 */
fun main(vararg args: String) {
    args.flatMap {//flatmap返回的还是集合类型，和Rxjava中flatMap类似
        it.split("_")//it是默认的元素
    }.map {
        print("$it  ${it.length}")//$模版表达式
    }
}
