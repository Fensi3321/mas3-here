package overlapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.EnumSet;

@Getter
@Setter
@AllArgsConstructor
public class Driver {
    private String name;
    private String lastname;
    EnumSet<DriverType> type;
}
