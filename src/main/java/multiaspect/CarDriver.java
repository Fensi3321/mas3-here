package multiaspect;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarDriver extends Person {
    private String currentCar;


    public CarDriver(String name, String lastname, String currentCar, Gender gender) {
        super(gender, name, lastname);
        this.currentCar = currentCar;
    }

}
