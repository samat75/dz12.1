package com.company.cars;

import com.company.Car;

public class Honda extends Car {
    @Override
    public void makeVoice(String w) {
        System.out.println(w);
    }
}
