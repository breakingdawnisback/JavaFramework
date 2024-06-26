package com.learningJava.learnjavaframework.example.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlConfigurationContextLauncher {

  public static void main(String[] args) {

    try (var context = 
    new ClassPathXmlApplicationContext("contextConfiguration.xml")) {

      Arrays.stream(context.getBeanDefinitionNames())
          .forEach(System.out::println);

      System.out.println(context.getBean("name"));
      System.out.println(context.getBean("age"));
      System.out.println(context.getBean("Role"));
      
    }

  }
}
