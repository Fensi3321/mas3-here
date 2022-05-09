package dynamic;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class RegularDriver extends Person {
    private List<String> licenses;
    private String car;

    public RegularDriver(String name, String lastname, String car, List<String> licenses) {
        super(name, lastname);
        this.car = car;
        this.licenses = licenses;
    }

    public RegularDriver(Person person, String car, List<String> licenses) {
        super(person.getName(), person.getLastname());
        this.car = car;
        this.licenses = licenses;
    }
}
