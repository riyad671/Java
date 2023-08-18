package com.yhr.Inheritance;

public class Main {
    public static void main(String[] args) {
        Bard phornix = new Bard("Light", "Red", 2, false, 2);

        System.out.println(phornix.getName());
        System.out.println(phornix.getColor());
        System.out.println(phornix.getLags());
        System.out.println(phornix.isHasTale());
        System.out.println(phornix.getWings());

        phornix.eat("Meat");

        phornix.fly();
    }
}
