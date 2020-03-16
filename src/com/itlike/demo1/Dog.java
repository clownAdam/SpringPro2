package com.itlike.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: SpringPro2
 * @Package: com.itlike.demo1
 * @ClassName: Dog
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/17 4:31
 * @Version: 1.0
 */
@Component("dog")
public class Dog {
    @Value("wc")
    public String name;
}
