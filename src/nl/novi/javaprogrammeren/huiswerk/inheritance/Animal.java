package nl.novi.javaprogrammeren.huiswerk.inheritance;

public abstract class Animal {

    private String name;
    private Gender gender;


    /**
     * Deze methode is niet abstract, omdat we deze kunnen overriden!
     */
    public void move() {
        System.out.println("I moved 0.50 meters");
    }

    /**
     * Deze methode is voor elk die hetzelfde, dus dezde zetten we in de superklasse.
     */
    public void sleep() {
        System.out.println("The animal sleeps");
    }

    public void eat(String foodName) {
        System.out.println("It eats " + foodName);
    }

    /**
     * Elk dier moet deze methode implementeren, maar ieder op zijn eigen manier. Daarom staat deze
     * als abstracte methode in de superklasse.
     */
    public abstract void sound();

}
