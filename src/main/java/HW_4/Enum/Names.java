package HW_4.Enum;

public enum Names {
    Bella("Bella"),
    Max("Max"),
    Luna("Luna"),
    Rocky("Rocky"),
    Stella("Stella"),
    Bruno("Bruno"),
    Emma("Emma"),
    Jack("Jack"),
    Sofia("Sofia"),
    Teddy("Teddy");

    private final String name;

    Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
