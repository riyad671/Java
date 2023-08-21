package com.yhrjfj.inter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(60);

        CarInterface fossilFuelCar = new FossilFuelCar("Mercedes");
        fossilFuelCar.start();
        fossilFuelCar.move(110);
    }
}
