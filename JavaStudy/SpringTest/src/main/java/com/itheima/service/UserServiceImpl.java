package com.itheima.service;

/**
 * @Author Jason
 * @Date 2021/09/13
 * @Describe:
 */
public class UserServiceImpl implements UserService {

    @Override
    public void save(){
        System.out.println("user service running....");
    }

    public void init(){
        System.out.println("user service init");
    }

    public void destroy(){
        System.out.println("user service destory");
    }
}
