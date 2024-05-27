package com.learningJava.learnjavaframework.game;

public class ContraGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go on lower floor");
    }
    public void left(){
        System.out.println("Go Back");
    }
    public void right(){
        System.out.println("Fire");
    }
    public void Action(){
        System.out.println("Boost");
    }

}
