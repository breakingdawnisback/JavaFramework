package com.learningJava.learnjavaframework.game;

import org.springframework.stereotype.Component;

//spring manage the component
@Component
public class PacmanGame implements GamingConsole{
    public void up(){
        System.out.println("Upside");
    }
    public void down(){
        System.out.println("Go on down");
    }
    public void left(){
        System.out.println("Go Left");
    }
    public void right(){
        System.out.println("Go right");
    }
    public void Action(){
        System.out.println("eat the ball");
    }
}
