package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class MainFootball {

    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    public static void main(String[] args) {

        List<Club> clubs = new ArrayList<>();

        for (int i = 0; i < 18; i++) {
            List<Player> players = new ArrayList<>();

            for (int j = 0; j < 20; j++) {
                String playerName = "Player " + i + "-" + j;
                Player player = new Player(playerName);
                players.add(player);
            }
            String clubname = "Cluppie " + i;
            clubs.add(new Club(clubname, players));
        }

        League league = new League("Eredivisie", clubs);

        // Print competition name via player:

        Player aPlayer = league.getClubs().get(0).getPlayers().get(0);

        System.out.println(aPlayer.getLeagueName());

    }
}
