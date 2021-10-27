package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class MainCar {
    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */
    public static void main(String[] args) {

        Car notAFerrari = new Car("12-12-12", "Nissan", "Sunny",10);
        Car daf = new Car("11-11-11", "DAF", "daf", 1111212);

        CarOwner carOwner = new CarOwner("Joost Autobezitter", 22);
        CarOwner underagePerson = new CarOwner("Pieter Piet", 12);

        CarDealer carDealer = new CarDealer("Autoverkoper Oude Troep");

        carDealer.addCar(notAFerrari);
        carDealer.addCar(daf);

        carDealer.transferCarToOwner(notAFerrari, carOwner);
        carDealer.transferCarToOwner(daf, underagePerson);

        System.out.println("Amount of cars in dealer: " + carDealer.getCars().size());
        System.out.println("Amount of cars carOwner: " + carOwner.getCars().size());
        System.out.println("Amount of cars underagePerson: " + underagePerson.getCars().size());
        System.out.println("Owner Nissan: " + notAFerrari.getOwner().getFullName());

        //THROWS NULL POINTER EXCEPTION
        // Dat verwachten we ook, want DAF heeft geen eigenaar, dus Owner is NULL!
        System.out.println("Owner Daf:" + daf.getOwner().getFullName());

    }
}
