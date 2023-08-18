package com.yhr.Inheritance;

public class Animal {
    private String name;
    private String color;
    private int lags;
    private boolean hasTale;

    public Animal(String name, String  color, int lags, boolean hasTale){
        this.name = name;
        this.color = color;
        this.lags = lags;
        this.hasTale = hasTale;
    }

    public void eat(String food){
        System.out.println("Eating " + food);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLags() {
        return this.lags;
    }

    public void setLags(int lags) {
        this.lags = lags;
    }

    public boolean isHasTale() {
        return this.hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }
}
