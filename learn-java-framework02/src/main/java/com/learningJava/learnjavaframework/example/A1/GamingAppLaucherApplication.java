package com.learningJava.learnjavaframework.example.A1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLaucherApplication {

public static void main(String[] args) {

    try( var context =
         new AnnotationConfigApplicationContext
                (GamingAppLaucherApplication.class)){

                  Arrays.stream(context.getBeanDefinitionNames())
                  .forEach(System.out::println);
      
    }
   

  }
}


