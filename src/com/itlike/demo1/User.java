package com.itlike.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @ProjectName: SpringPro2
 * @Package: com.itlike.demo1
 * @ClassName: User
 * @Author: Administrator
 * @Description:
 * @Date: 2020/3/16 19:05
 * @Version: 1.0
 */
@Component("user")
@Scope("prototype")
public class User {
    @Value("itlike")
    public String name;

   /* @Autowired
    @Qualifier("dog")*/
   @Resource(name = "dog")
   public Dog dog;
   @PostConstruct
   public void init(){
       System.out.println("init---user");
   }
   @PreDestroy
   public void destroy(){
       System.out.println("destroy---");
   }

}
