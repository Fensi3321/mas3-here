package multiaspect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private Gender gender;
    private String name;
    private String lastname;

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Gender {
        private GenderType gender;

        public void maleThings() {
            if (gender.equals(GenderType.MALE)) {
                System.out.println("Doin male things");
            }
        }

        public void femaleThings() {
            if (gender.equals(GenderType.FEMALE)) {
                System.out.println("doing female things");
            }
        }
    }
}
