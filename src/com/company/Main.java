package com.company;

import com.company.cars.*;

public class Main {

    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.makeVoice("nhhh");

        Mercedes mercedes = new Mercedes();
        mercedes.makeVoice("trrr");

        Honda honda = new Honda();
        honda.makeVoice("fdsfsf");

        Sedan sedan = new Sedan();
        sedan.makeVoice("hicvw");

        Porshe porshe = new Porshe();
        porshe.makeVoice("owjowdcw");
    }
}