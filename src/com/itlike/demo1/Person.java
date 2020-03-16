package com.itlike.demo1;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ProjectName: SpringPro2
 * @Package: com.itlike.demo1
 * @ClassName: Person
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/17 4:50
 * @Version: 1.0
 */
public class Person {
    @Value("zs")
    public String name;
}
