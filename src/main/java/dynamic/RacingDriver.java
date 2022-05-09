package dynamic;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RacingDriver extends Person {
    private String teamName;
    private List<String> racingLicenses;

    public RacingDriver(String name, String lastname, String teamName, List<String> racingLicenses) {
        super(name, lastname);
        this.racingLicenses = racingLicenses;
        this.teamName = teamName;
    }

    public RacingDriver(Person person, String teamName, List<String> racingLicenses) {
        super(person.getName(), person.getLastname());
        this.teamName = teamName;
        this.racingLicenses = racingLicenses;
    }
}
