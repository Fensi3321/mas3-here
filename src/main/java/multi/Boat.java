package multi;

import abstractlass.Vehicle;

public class Boat extends Vehicle implements Floatable {

    @Override
    public void swim() {
        System.out.println("Sailing and not drowning :3");
    }

    @Override
    public void sound() {}
}
