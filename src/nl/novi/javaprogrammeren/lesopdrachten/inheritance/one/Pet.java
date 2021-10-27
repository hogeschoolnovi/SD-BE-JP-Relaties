package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class Pet extends Animal {

    protected String petOwnerName;
    protected String favouriteFoodBrandName;
    protected String speciesName;

    /**
     * Alleen huisdieren bewegen 0.25 meter, dus we overriden de methode hier!
     */
    @Override
    public void move() {
        System.out.println("I moved 0.25 meters");
    }
}
