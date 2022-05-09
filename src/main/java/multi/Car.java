package multi;

import abstractlass.Vehicle;

public class Car extends Vehicle implements Driveable {
    @Override
    public void drive() {
        System.out.println("Driving on land");
    }

    @Override
    public void sound() {}
}
