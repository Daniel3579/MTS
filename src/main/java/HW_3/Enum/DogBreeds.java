package HW_3.Enum;

public enum DogBreeds {
    GoldenRetriever("Golden Retriever"),
    GermanShepherd("German Shepherd"),
    LabradorRetriever("Labrador Retriever");

    private final String breed;

    DogBreeds(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
