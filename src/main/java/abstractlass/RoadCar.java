package abstractlass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class RoadCar extends Vehicle {
    private int numberOfSeats;

    public RoadCar(String make, String fuel, Double displacement, LocalDate manufactureDate, int numberOfSeats) {
        super(make, fuel, displacement, manufactureDate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void sound() {
        System.out.println("pyr pyr pyr");
    }
}
