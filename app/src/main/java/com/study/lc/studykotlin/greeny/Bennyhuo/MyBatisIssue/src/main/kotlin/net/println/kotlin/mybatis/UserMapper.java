package com.study.lc.studykotlin.greeny.Bennyhuo.MyBatisIssue.src.main.kotlin.net.println.kotlin.mybatis;

import net.println.kotlin.mybatis.User;

/**
 * Created by benny on 3/25/17.
 */
//@Mapper
public interface UserMapper {
//    @Select("SELECT * FROM userinfo WHERE id = #{id}")
    User selectUser(int id);
}