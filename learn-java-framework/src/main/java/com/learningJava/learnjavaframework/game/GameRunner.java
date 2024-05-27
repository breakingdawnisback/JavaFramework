package com.learningJava.learnjavaframework.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
       
    }

    public void run() {
       System.out.println("Running Game:0" + game );
       game.up();
       game.left();
       game.down();
       game.right();
       game.Action();
    }

}
