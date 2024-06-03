package com.learningJava.learnjavaframework.Helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloworldSpring {
public static void main(String[] args) {
    //1:Launch a spring Context

    try(var context = 
    new AnnotationConfigApplicationContext(HelloworldConfiguration.class)){

          //2:Config the thing that we want we want spring to manage - 
    //HelloworldConfiguration - @Configuration
    //name-@Bean

    //3:Retrieveing Beans managed by Spring
    System.out.println(context.getBean("name")); 
    //Testing
    System.out.println(context.getBean("Age"));
    System.out.println(context.getBean("person"));
    System.out.println(context.getBean("address2"));
    System.out.println(context.getBean("person2MethodCall"));
    System.out.println(context.getBean("person3Parameter"));
    
    }
    
}
}
  