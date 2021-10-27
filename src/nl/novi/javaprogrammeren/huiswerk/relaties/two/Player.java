package nl.novi.javaprogrammeren.huiswerk.relaties.two;

public class Player {

    private String fullName;
    private Club club;

    public Player(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getLeagueName() {
        return club.getLeagueName();
    }
}
