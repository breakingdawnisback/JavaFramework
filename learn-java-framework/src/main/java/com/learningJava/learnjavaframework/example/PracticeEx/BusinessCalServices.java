package com.learningJava.learnjavaframework.example.PracticeEx;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalServices {
private DataServices dataServices;

public BusinessCalServices(DataServices dataServices){
    super();
    this .dataServices =dataServices;

}

    public int findMax(){
        return Arrays.stream(dataServices.retrieveData())
                                .max() .orElse(0);
    }

}
