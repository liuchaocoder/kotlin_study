package net.println.kt08

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by benny on 11/1/16.
 */
interface GitHubService{

    @GET("/repos/enbandari/Kotlin-Tutorials/stargazers")
    fun getStarGazers(): Call<List<User>>
}

object Service{//1.object声明的单例对象不能声明构造函数，因为单例对象只有一个实例，无需我们手动将它创建出来，因此自然不需要构造函数。
//2.如果需要对单例对象做初始化操作，可以在init初始化块内进行
//3.官方文档的解释是，object是lazy-init，即在第一次使用时被创造出来的
val gitHubService: GitHubService by lazy {//1.lazy{} 只能用在val类型, lateinit 只能用在var类型 2.lateinit不能用在可空的属性上和java的基本类型上
        Retrofit.Builder().baseUrl("https://api.github.com").addConverterFactory(GsonConverterFactory.create()).build().create(GitHubService::class.java)//创建实例，加上后缀.java,GitHubService::class.java
    }
}

fun main(args: Array<String>) {
    Service.gitHubService.getStarGazers().execute().body().map(::println)
}