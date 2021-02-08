package com.company;

public class Garaje<T> implements Spoilable{

    private T avto;

    public Garaje(T avto) {
        this.avto = avto;
    }

    public T getAvto() {
        return avto;
    }

    public void setAvto(T avto) {
        this.avto = avto;
    }

}

