package HW_3.Enum;

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
