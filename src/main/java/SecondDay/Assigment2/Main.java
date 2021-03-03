package SecondDay.Assigment2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Player jordan = new Player("Jordan", 33, 30000, 24, 10, 4);
        Player kobe = new Player("Kobe", 24, 10000, 21, 15, 1);
        Player carmelo = new Player("Carmelo", 20, 20000, 34, 5, 15);

        Coach coachBulls = new Coach("John", 45, 4500, 5);


        Player irving = new Player("Irving", 25, 5000, 13, 20, 3);
        Player duncan = new Player("duncan", 20, 10000, 27, 5, 20);
        Player ewing = new Player("Ewing", 35, 10000, 26, 5, 20);

        Coach coachLakers = new Coach("Michael", 55, 5500, 12);

        Set<Player> bullsPlayer = new HashSet<>();
        bullsPlayer.add(jordan);
        bullsPlayer.add(kobe);
        bullsPlayer.add(carmelo);

        Set<Player> lakersPlayers = new HashSet<>();
        lakersPlayers.add(irving);
        lakersPlayers.add(duncan);
        lakersPlayers.add(ewing);

        Set<Coach> coachesOfTeams = new HashSet<>();
        coachesOfTeams.add(coachBulls);
        coachesOfTeams.add(coachLakers);




        List<Team> teamList = new ArrayList<>();
        teamList.add(new Team("Bulls", coachBulls, bullsPlayer, 61, 20));
        teamList.add(new Team("Lakers", coachLakers, lakersPlayers, 44, 17));

        StatsCalculator statsCalculator = new StatsCalculator();
        statsCalculator.compareTwoTeams(teamList.get(0), teamList.get(1));
        statsCalculator.compareTwoTeams(teamList.get(0), teamList.get(1));



        statsCalculator.printTeamStats(teamList);

        System.out.println("Team with most points: ");
        statsCalculator.getTeamWithMostPoints(teamList.get(0), teamList.get(1));

        statsCalculator.bestPlayerInOneTeam(lakersPlayers);

        statsCalculator.compareToGivePlayer(teamList, 0, 1);

        statsCalculator.bestPlayerInEveryTeam(teamList);

        statsCalculator.findBestPlayer(teamList.get(0));

        statsCalculator.findBestCoachInTeams(coachesOfTeams);

        statsCalculator.findBestWinningTeam(teamList);

        statsCalculator.findBestLosingTeam(teamList);

        statsCalculator.sortTeamByPointsPerGame(teamList);



    }
}
