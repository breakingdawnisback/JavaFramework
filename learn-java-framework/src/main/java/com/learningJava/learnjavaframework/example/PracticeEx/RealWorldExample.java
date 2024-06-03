package com.learningJava.learnjavaframework.example.PracticeEx;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldExample{

public static void main(String[] args) {

    try( var context =
         new AnnotationConfigApplicationContext
                (RealWorldExample.class)){

                  Arrays.stream(context.getBeanDefinitionNames())
                  .forEach(System.out::println);

                  System.out.println(context.getBean(BusinessCalServices.class).findMax());
      
    }
   

  }
}


