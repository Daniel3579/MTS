package HW_6.Enum;

public enum Characters {
    Loyal("Loyal"),
    Curious("Curious"),
    Playful("Playful"),
    Protective("Protective"),
    Independent("Independent"),
    Affectionate("Affectionate"),
    Energetic("Energetic"),
    Docile("Docile"),
    Agile("Agile"),
    Intelligent("Intelligent");

    private final String character;

    Characters(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }
}
