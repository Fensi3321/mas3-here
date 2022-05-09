package multi;

import abstractlass.Vehicle;

public class Amphibian extends Vehicle implements Driveable, Floatable{
    @Override
    public void drive() {
        System.out.println("I can drive");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void sound() {}
}
