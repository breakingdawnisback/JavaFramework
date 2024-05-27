package com.learningJava.learnjavaframework.example.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}
@Component
// the initialization of the bin is automatically performed.
// How do I prevent that from happening?
// That's where I can make use of at lazy initilaization.
// So at lazy organize inputs or spring framework context annotation lazy,
@Lazy
class ClassB{
  public ClassB(ClassA classA){
    System.out.println("kuch hua hoga");
  }

  public void dosmthing(){
    System.out.println("Initialization of context is complete");
  }
}

@Configuration
// in here ComponentScan automatic scan the current package
@ComponentScan
public class LazyInitilizationSpringBean {

  public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(LazyInitilizationSpringBean.class)) {

      Arrays.stream(context.getBeanDefinitionNames())
          .forEach(System.out::println);

      System.out.println("Initialization of context is complete");

      context.getBean(ClassB.class).dosmthing();

    }

  }
}

// Lazy annotation:

// • Can be used almost everywhere @Component and @Bean are used ■ Lazy-resolution proxy will be injected instead of actual dependency

// • Can be used on Configuration (@Configuration) class
