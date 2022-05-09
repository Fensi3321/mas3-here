package abstractlass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Vehicle {
    private String make;
    private String fuel;
    private Double displacement;
    private LocalDate manufactureDate;

    public abstract void sound();
}
