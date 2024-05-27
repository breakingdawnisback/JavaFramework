package com.learningJava.learnjavaframework.example.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
  private SomeDependency someDependency;

  public SomeClass(SomeDependency someDependency) {
    super();
    this.someDependency = someDependency;
    System.out.println("dependencies are ready");

  }

  @PostConstruct
  public void initialize() {
    
    someDependency.getReady();

  }
  //  In the method as a callback notification to signal that 
  // the instance is in the process of being removed
  // by the container.
  @PreDestroy
  public void cleanup(){

    System.out.println("Cleanup");
  
  }
}

@Component
class SomeDependency {

  public void getReady() {
    System.out.println("Some Logic using dependency");
  }
}

@Configuration
// in here ComponentScan automatic scan the current package
@ComponentScan
public class PrePostAnnotationContextlauncher {

  public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextlauncher.class)) {

      Arrays.stream(context.getBeanDefinitionNames())
          .forEach(System.out::println);

    }

  }
}
