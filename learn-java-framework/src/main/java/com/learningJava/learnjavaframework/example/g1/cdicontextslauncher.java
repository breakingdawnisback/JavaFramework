package com.learningJava.learnjavaframework.example.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//in jakarta named is used insteed of component
@Named
class BusinessService{
  private DataService dataservice;

  //inject insteed of autowired
  @Inject
  public void setDataservice(DataService dataservice) {
    System.out.println("injected");
    this.dataservice = dataservice;
  }
  public DataService getDataservice() {
    return dataservice;
  }


}
@Named
class DataService {

}

@Configuration
// in here ComponentScan automatic scan the current package
@ComponentScan
public class cdicontextslauncher {

  public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(cdicontextslauncher.class)) {

      Arrays.stream(context.getBeanDefinitionNames())
          .forEach(System.out::println);


    }

  }
}
