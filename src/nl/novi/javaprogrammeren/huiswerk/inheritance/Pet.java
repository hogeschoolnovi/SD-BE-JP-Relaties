package nl.novi.javaprogrammeren.huiswerk.inheritance;

public abstract class Pet extends Animal {

    private String petOwnerName;
    private String favouriteFoodBrandName;
    private String speciesName;

    /**
     * Alleen huisdieren bewegen 0.25 meter, dus we overriden de methode hier!
     */
    @Override
    public void move() {
        System.out.println("I moved 0.25 meters");
    }

    public String getPetOwnerName() {
        return petOwnerName;
    }

    public void setPetOwnerName(String petOwnerName) {
        this.petOwnerName = petOwnerName;
    }

    public String getFavouriteFoodBrandName() {
        return favouriteFoodBrandName;
    }

    public void setFavouriteFoodBrandName(String favouriteFoodBrandName) {
        this.favouriteFoodBrandName = favouriteFoodBrandName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}
