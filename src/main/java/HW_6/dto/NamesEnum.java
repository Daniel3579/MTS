package HW_6.dto;

import java.util.List;
import java.util.Random;

public enum NamesEnum {
    Widget,
    Squee,
    Nibbler,
    Swifty,
    Ginger,
    Jiggly,
    Moonpie,
    Jaxon,
    Leeko,
    Cassie,
    Piku,
    Crispin,
    Sugare,
    Ponyo,
    Snortle,
    Meister,
    Altai,
    Paladin,
    Moura,
    Marzipan,
    Waly,
    Suds,
    Yung,
    Cheche,
    Killy;

    private static final List<NamesEnum> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static NamesEnum randomName() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
