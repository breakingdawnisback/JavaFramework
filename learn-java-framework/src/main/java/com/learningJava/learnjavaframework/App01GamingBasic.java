package com.learningJava.learnjavaframework;

import com.learningJava.learnjavaframework.game.ContraGame;
import com.learningJava.learnjavaframework.game.GameRunner;

public class App01GamingBasic {
public static void main(String[] args) {

    // var game = new MarioGame();
     var game = new ContraGame();
    var gameRunner =  new GameRunner(game);
    gameRunner.run();
}
}
