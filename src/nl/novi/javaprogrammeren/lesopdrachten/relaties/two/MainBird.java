package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class MainBird {

    /*
    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse BirdOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */

    public static void main(String[] args) {
        BirdOwner birdOwner = new BirdOwner("Nova", "female");

        for (int i = 0; i < 10; i++) {
            birdOwner.addBird(new Bird("name" + i, "canary", i + "A", "male"));
        }

        for (int i = 10; i < 20; i++) {
            birdOwner.addBird(new Bird("name" + i, "canary", i + "A", "female"));
        }

        System.out.println(birdOwner);

        birdOwner.changeListToFiveFemalesAndFiveMales();
        System.out.println("After random selection");
        System.out.println(birdOwner);
    }


}
