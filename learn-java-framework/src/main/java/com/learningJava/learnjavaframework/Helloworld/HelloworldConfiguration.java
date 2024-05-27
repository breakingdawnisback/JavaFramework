package com.learningJava.learnjavaframework.Helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Released in JDK 16.

record Person (String name, int Age , Address address){};
record Address(String firstline , String City){};
 
@Configuration
public class HelloworldConfiguration {
    @Bean
    public String name(){
        return "Nishant";
    }
    @Bean
    public int Age(){
        return 25;
    } 
    @Bean
    public Person person(){
        return new Person("Ashish",27,new Address("Dharam Colony", "Gurugram"));
    }
    //new name and age created along with the address
    @Bean
    public Person person2MethodCall(){
        return new Person(name(),Age(), address());
    }

    //Alternative Appro
    @Bean
    public Person person3Parameter(String name,int Age,Address address3){
        return new Person(name,Age, address3);
    }
    @Bean(name="address2")
    public Address address(){
        return new Address("Palam Vihar","Gurugram");
    }

    @Bean(name="address3")
    public Address address3(){
        return new Address("Geeta Apartment","Gurugram");
    }
}
