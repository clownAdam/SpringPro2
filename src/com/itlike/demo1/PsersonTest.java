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
public class PsersonTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println("person = " + person.name);
    }
}
