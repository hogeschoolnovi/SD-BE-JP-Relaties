package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class Bird {

    private String nickname;
    private final String species;
    private final String ringNumber;

    // Gender cannot be final, because we have a constructor without gender.
    private String gender;

    public Bird(String nickname, String species, String ringNumber) {
        this.nickname = nickname;
        this.species = species;
        this.ringNumber = ringNumber;
    }

    public Bird(String nickname, String species, String ringNumber, String gender) {
        this.nickname = nickname;
        this.species = species;
        this.ringNumber = ringNumber;
        this.gender = gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getSpecies() {
        return species;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.getNickname() + " with number: " + this.getRingNumber();
    }
}
