import abstractlass.RallyCar;
import abstractlass.RoadCar;
import abstractlass.Vehicle;
import dynamic.Person;
import dynamic.RacingDriver;
import dynamic.RegularDriver;
import multi.*;
import overlapping.Driver;
import overlapping.DriverType;

import java.time.LocalDate;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Abstract class
        Vehicle v1 = new RoadCar("Honda", "petrol", 2.0d, LocalDate.of(1998, 03,20), 4);
        Vehicle v2 = new RallyCar("Toyota", "racing fuel", 1.6d, LocalDate.of(2022, 01, 12), true, true);

        // Overlapping
        Driver d1 = new Driver("Robert", "Kubica", EnumSet.of(DriverType.RACING));
        Driver d2 = new Driver("Adam", "Małysz", EnumSet.of(DriverType.REGULAR, DriverType.RACING));
        Driver d3 = new Driver("Warol", "Kojtyła", EnumSet.of(DriverType.REGULAR));

        System.out.println(d1.getName() + d1.getType());
        System.out.println(d2.getName() + d2.getType());
        System.out.println(d3.getName() + d3.getType());

        // Multi
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle amphibian = new Amphibian();
        Set<Vehicle> vehicles = Set.of(car, boat, amphibian);

        vehicles.forEach( x -> {
            if (x instanceof Driveable && x instanceof Floatable) {
                System.out.println("I am both a car and a boat :3");
                ((Floatable) x).swim();
                ((Driveable) x).drive();
            }
        });

        // Dynamic
        RegularDriver sundayDriver = new RegularDriver("Robert", "Kubica", "Honda Prelude", List.of("B"));
        RacingDriver racingDriver = new RacingDriver(sundayDriver, "Alfa Romeo F1 Team", List.of("superlicense, fia platinum license"));

        System.out.println(racingDriver.getName());

    }
}
