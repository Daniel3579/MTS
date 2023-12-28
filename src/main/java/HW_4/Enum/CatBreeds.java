package HW_4.Enum;

public enum CatBreeds {
    Siamese("Siamese"),
    MaineCoon("Maine coon"),
    Persian("Persian");

    private final String breed;

    CatBreeds(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
