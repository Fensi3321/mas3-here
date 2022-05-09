package abstractlass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class RallyCar extends Vehicle {
    private boolean isHybrid;
    private boolean hasRollCage;

    public RallyCar(String make, String fuel, Double displacement, LocalDate manufactureDate, boolean isHybrid, boolean hasRollCage) {
        super(make, fuel, displacement, manufactureDate);
        this.hasRollCage = hasRollCage;
        this.isHybrid = isHybrid;
    }

    @Override
    public void sound() {
        System.out.println("WRRRRRRR");
    }
}
