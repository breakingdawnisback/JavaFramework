package com.learningJava.learnjavaframework.example.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{

}



@Configuration
// in here ComponentScan automatic scan the current package
@ComponentScan
public class SpringScopeBean {

  public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(SpringScopeBean.class)) {

      Arrays.stream(context.getBeanDefinitionNames())
          .forEach(System.out::println);

     System.out.println(context.getBean(NormalClass.class));
     System.out.println(context.getBean(NormalClass.class));

     System.out.println(context.getBean(PrototypeClass.class));
     System.out.println(context.getBean(PrototypeClass.class));
     System.out.println(context.getBean(PrototypeClass.class));

    }

  }
}
