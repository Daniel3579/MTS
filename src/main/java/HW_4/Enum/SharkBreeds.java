package HW_4.Enum;

public enum SharkBreeds {
    GreatWhite("Great White"),
    TigerShark("Tiger Shark"),
    Hammerhead("Hammerhead");

    private final String breed;

    SharkBreeds(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
