package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

/**
 * Cat extends Pet only, want Pet Extends Animal! En zo kom je dus uiteindelijk wel bij Animal uit.
 */
public class Cat extends Pet {

    private boolean isOutsideCat;

    @Override
    public void sound() {
        System.out.println("Bark");
    }

    public boolean isOutsideCat() {
        return isOutsideCat;
    }

    public void setOutsideCat(boolean outsideCat) {
        isOutsideCat = outsideCat;
    }
}
