package com.itlike.demo1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: SpringPro2
 * @Package: com.itlike.demo1
 * @ClassName: UserTest
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/16 19:07
 * @Version: 1.0
 */
public class UserTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
        System.out.println(user.name);
        System.out.println(user.dog.name);
        applicationContext.close();
    }
}
