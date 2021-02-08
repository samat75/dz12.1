package com.company.cars;

import com.company.Car;

public class Sedan extends Car {
    @Override
    public void makeVoice(String w) {
        System.out.println(w);
    }
}
