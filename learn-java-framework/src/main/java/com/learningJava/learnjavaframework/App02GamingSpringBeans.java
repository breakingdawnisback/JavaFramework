package com.learningJava.learnjavaframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learningJava.learnjavaframework.game.GameRunner;
import com.learningJava.learnjavaframework.game.GamingConsole;

public class App02GamingSpringBeans {
public static void main(String[] args) {

    try( var context =
         new AnnotationConfigApplicationContext
                (GamingConfiguration.class)){

        context.getBean(GamingConsole.class).down();
        context.getBean(GameRunner.class).run();
    }
   

  }
}
