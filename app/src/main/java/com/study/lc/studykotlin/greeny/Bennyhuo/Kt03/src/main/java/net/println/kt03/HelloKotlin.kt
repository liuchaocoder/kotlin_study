package net.println.kt03

/**
 * Created by benny on 10/11/16.
 */
fun main(args: Array<out String>) {
    val user = User(0, "bennyhuo")
    println(user)
    println()
    HelloKotlin::class.constructors.map(::println)
    //1.使用反射，需要引入reflect库2.HelloKotlin::class获得类引用3。::println是是一个函数类型的值,Lamdba表达式
}
class HelloKotlin {
    fun hello() {

    }
}
// 1反射是一系列语言和库的特性，允许在运行是获取你代码结构。 Kotlin 把函数和属性作为语言的头等类，而且反射它们和使用函数式编程或反应是编程风格很像。
//    2最基本的反射特性就是得到运行时的类引用。要获取引用并使之成为静态类可以使用字面类语法：
//    val c = MyClass::class
//    引用是一种 KClass类型的值。你可以使用 KClass.properties 和 KClass.extensionProperties 获取类和父类的所有属性引用的列表。
//    注意这与 java 类的引用是不一样的。
//    3当有一个像下面这样的函数声明时：
//
//    fun isOdd(x: Int) =x % 2 !=0
//    我们可以通过 isOdd(5) 轻松调用，同样我们也可以把它作为一个值传递给其它函数。我们可以使用 :: 操作符
//
//    val numbers = listOf(1, 2, 3)
//    println(numbers.filter( ::isOdd) ) //prints [1, 3]
//    这里 ::isOdd 是是一个函数类型的值 (Int) -> Boolean
//
//    注意现在 :: 操作符右边不能用语重载函数。将来，我们计划提供一个语法明确参数类型这样就可以使用明确的重载函数了。
//
//    如果需要使用一系列类，或者扩展函数，必须是需合格的，并且结果是扩展函数类型，比如。String::toCharArray 就带来一个 String: String.() -> CharArray 类型的扩展函数。

//}考虑一下下面的函数：
//
//fun compose<A, B, C>(f: (B) -> C, g: (A) -> B): (A) -> C {
//    return {x -> f(g(x))}
//}
//它返回一个由俩个传递进去的函数的组合。现在你可以把它用在可调用的引用上了：
//
//fun length(s: String) = s.size
//val oddLength = compose(::isOdd, ::length)
//val strings = listOf("a", "ab", "abc")
//
//println(strings.filter(oddLength)) // Prints "[a, abc]"