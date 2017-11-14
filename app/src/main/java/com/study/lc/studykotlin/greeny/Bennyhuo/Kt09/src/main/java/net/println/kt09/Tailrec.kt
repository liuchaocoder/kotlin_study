package net.println.kt09

import java.math.BigInteger

/**
 * Created by benny on 11/6/16.
 */
class Result(var value: BigInteger = BigInteger.valueOf(1L))
//1.尾递归，该方法最后调用2.这里是求阶乘3.value的默认值是14.定义Result暂存结果，实现尾递归
//5.尾递归优化的实质是for循环
tailrec fun factorial(num: Int, result: Result){//尾递归优化的关键字tailrec
    if(num == 0) result.value = result.value.times(BigInteger.valueOf(1L))
    else {
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        factorial(num - 1, result)//方法最后调用，实现了尾递归
    }
}

fun main(args: Array<String>) {
    val result = Result()
    factorial(1000000, result)
    println(result.value)
}