package HW_4.Interface;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Animal {

    // Returns animal breed
    String getBreed();

    // Returns animal name
    String getName();

    // Returns animal cost
    BigDecimal getCost();

    // Returns animal character
    String getCharacter();

    // Returns animal birthday date
    LocalDate getBirthday();
}
