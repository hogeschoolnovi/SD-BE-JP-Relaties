package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.List;

public class League {

    private String leagueName;
    private List<Club> clubs;

    public League(String leagueName, List<Club> clubs) {
        if(clubs.size() != 18) {
            throw new RuntimeException("Amount of clubs is incorrect");
        }
        this.leagueName = leagueName;
        this.clubs = clubs;

        updateClubsWithLeague();
    }

    private void updateClubsWithLeague() {
        for(Club club : clubs) {
            club.setLeague(this);
        }
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
