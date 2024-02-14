package HW_6.Enum;

public enum WolfBreeds {
    Gray("Gray"),
    Arctic("Arctic"),
    Red("Red");

    private final String breed;

    WolfBreeds(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
