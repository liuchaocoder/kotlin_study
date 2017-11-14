package net.println.kt06

/**
 * Created by benny on 10/15/16.
 */

enum class Lang(val hello: String){//1.定义枚举使用enum class
    ENGLISH("Hello"),
    CHINESE("你好"),
    JAPANESE("こんにちは"),
    KOREAN("안녕하새요");

    fun sayHello(){
        println(hello)
    }

    companion object{//伴生对象，用于定义静态方法，属性
        fun parse(name: String):Lang{
            return Lang.valueOf(name.toUpperCase())
        }
    }
}

fun main(args: Array<String>) {
    if(args.size == 0) return
    val lang = Lang.parse(args[0])
    println(lang)
    lang.sayHello()
    lang.sayBye()
}

fun Lang.sayBye(){//不修改类，对类进行方法对扩展
    val bye = when(this){//when判断，比switch强大很多
        Lang.ENGLISH -> {
            "Bye"
        }
        Lang.CHINESE ->"再见"
        Lang.JAPANESE ->"さようなら"
        Lang.KOREAN -> "안녕히가세요"
    }
    println(bye)
}
