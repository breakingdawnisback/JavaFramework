package com.learningJava.learnjavaframework.example.PracticeEx;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class MongoDbDataService implements DataServices{

    @Override
    public int[] retrieveData() {

        return new int[]{11, 22 , 33 , 44 , 55};
    }



}
