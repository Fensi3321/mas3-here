package multiaspect;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TruckDriver extends Person {
    private String employee;
    public TruckDriver(String name, String lastname, String employee, Gender gender) {
        super(gender, name, lastname);
        this.employee = employee;
    }
}
