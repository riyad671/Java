package com.yhr.Inheritance;

public class Bard extends Animal{
    private int wings;
    public Bard(String name, String color, int lags, boolean hasTale, int wings){
        super(name, color, lags, hasTale);
        this.wings = wings;
    }

    public int getWings(){
        return this.wings;
    }
    public void setWings(int wings){
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        System.out.println("I don't know what, a phornix eat...");
    }

    public void fly(){
        System.out.println(this.getName() + " is flying.");
    }
}
