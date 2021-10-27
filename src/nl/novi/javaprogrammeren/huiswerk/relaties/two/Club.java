package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.List;

public class Club {

    private String clubname;
    private List<Player> players;
    private League league;

    public Club(String clubname, List<Player> players) {
        if(players.size() < 18 || players.size() > 25) {
            throw new RuntimeException("Not a legal amount of players");
        }
        this.clubname = clubname;
        this.players = players;
        updatePlayersWithClub();
    }

    private void updatePlayersWithClub() {
        for (Player player : players) {
            player.setClub(this);
        }
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public String getLeagueName() {
        return league.getLeagueName();
    }
}
