package HW_6.helper;

import java.time.LocalDate;
import java.time.Period;

public final class AnimalCalculatorHelper {
    private AnimalCalculatorHelper() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Проверка года на весокосность
     *
     * @param year год
     * @return true - если високосный, иначе - false
     */
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    /**
     * Подсчет возраста животного
     *
     * @param birthDate день рождения животного
     * @return возраст животного
     */
    public static int calculateAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
