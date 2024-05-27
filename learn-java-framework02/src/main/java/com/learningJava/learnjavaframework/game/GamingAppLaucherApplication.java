package com.learningJava.learnjavaframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// How can I tell spring which package to search in that where you would add something called component scan.
// So let's add in component.
// Scan at component scan.
@ComponentScan("com.learningJava.learnjavaframework.game;")
public class GamingAppLaucherApplication {

public static void main(String[] args) {

    try( var context =
         new AnnotationConfigApplicationContext
                (GamingAppLaucherApplication.class)){

        context.getBean(GamingConsole.class).down();
        context.getBean(GameRunner.class).run();
    }
   

  }
}


