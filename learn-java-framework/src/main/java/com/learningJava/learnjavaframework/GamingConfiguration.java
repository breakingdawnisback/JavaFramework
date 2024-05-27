package com.learningJava.learnjavaframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learningJava.learnjavaframework.game.GameRunner;
import com.learningJava.learnjavaframework.game.GamingConsole;
import com.learningJava.learnjavaframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
    
    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }
    
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
