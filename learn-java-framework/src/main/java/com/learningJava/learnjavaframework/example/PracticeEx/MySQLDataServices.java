package com.learningJava.learnjavaframework.example.PracticeEx;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataServices implements DataServices {

    @Override
    public int[] retrieveData() {

        return new int[]{1, 2 , 3 , 4 , 5};
    }


}
