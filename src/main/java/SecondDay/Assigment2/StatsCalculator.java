package SecondDay.Assigment2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StatsCalculator {

    /*
Compare stats of 2 given teams. Eg. TeamA Has 15.2 more ppg than TeamB, TeamA has 2.6 more apg than TeamB, etc..
Print out stats of given list of teams.
Find team with most points per game of given team list.
Find best player in every team. Input list of teams.
Find best player in ONE given team.
Compare two given player stats.
Find most experienced coach in given team list
Find most winning team by given team list
Find Most loosing team by given team list.
Sort all of the players by ppg (points per game) Given list of teams.
BONUS: Cover StatsCalculator with unit tests.
     */

    public void compareTwoTeams(Team teamA, Team teamB) {
        if (teamA.getPointsPerGame() > teamB.getPointsPerGame()) {
            double difference = teamA.getPointsPerGame() - teamB.getPointsPerGame();
            System.out.println(teamA.getName() + " turi " + difference + " daugiau tasku nei " + teamB.getName());
        } else {
            double difference = teamB.getPointsPerGame() - teamA.getPointsPerGame();
            System.out.println(teamB.getName() + " turi " + difference + " daugiau tasku nei " + teamA.getName());
        }
        if (teamA.getAssistPerGame() > teamB.getAssistPerGame()) {
            double difference = teamA.getAssistPerGame() - teamB.getAssistPerGame();
            System.out.println(teamA.getName() + " turi " + difference + " daugiau perdavimu nei " + teamB.getName());
        } else {
            double difference = teamB.getAssistPerGame() - teamA.getAssistPerGame();
            System.out.println(teamB.getName() + " turi " + difference + " daugiau perdavimu nei " + teamA.getName());
        }
        if (teamA.getReboundsPerGame() > teamB.getReboundsPerGame()) {
            double difference = teamA.getReboundsPerGame() - teamB.getReboundsPerGame();
            System.out.println(teamA.getName() + " turi " + difference + " daugiau atkovotu kamuoliu nei " + teamB.getName());
        } else {
            double difference = teamB.getReboundsPerGame() - teamA.getReboundsPerGame();
            System.out.println(teamB.getName() + " turi " + difference + " daugiau atkovotu kamuoliu nei " + teamA.getName());
        }
    }

    public void printTeamStats(List<Team> teams) {
        for (Team team : teams) {
            System.out.println(team);
        }
    }


    public void getTeamWithMostPoints(Team teamA, Team teamB) {
        if (teamA.getPointsPerGame() > teamB.getPointsPerGame()) {
            double difference = teamA.getPointsPerGame() - teamB.getPointsPerGame();
            System.out.println(teamA.getName() + " imeta daugiau " + teamB.getName());
        } else {
            double difference = teamB.getPointsPerGame() - teamA.getPointsPerGame();
            System.out.println(teamB.getName() + " imeta daugiau " + teamA.getName());
        }
    }


    public void findBestPlayer(Team teams) {

        Player player = teams.getPlayers().stream().max(Comparator.comparing(Player::getPointPerGame)).orElseThrow(NoSuchElementException::new);

        System.out.println(player.getName() + " is the best player in " + teams.getName());
    }

    public void bestPlayerInOneTeam(Set<Player> player) {
        for (Player player1 : player) {
            Player bestPlayerInTeam = player.stream().max(Comparator.comparingDouble(Player::getPointPerGame)).get();
            System.out.println(bestPlayerInTeam.getName());
            break;
        }
    }

    public void compareToGivePlayer(List<Team> team, int position1, int position2) {

        Player player1 = team.get(position1).getPlayers().stream().max(Comparator.comparingDouble(Player::getPointPerGame)).get();

        Player player2 = team.get(position2).getPlayers().stream().max(Comparator.comparingDouble(Player::getPointPerGame)).get();

        if (player1.getPointPerGame() > player2.getPointPerGame()) {
            System.out.println(player1.getName() + " has the best stats");
        } else if (player2.getPointPerGame() > player1.getPointPerGame()) {
            System.out.println(player2.getName() + " has the best stats");
        }
    }

    public void bestPlayerInEveryTeam(List<Team> teams) {

        for (int i = 0; i < teams.size(); i++) {
            System.out.println("Best player in teams: " + teams.get(i).getPlayers().stream().max(Comparator.comparing((Player::getPointPerGame))).get());
        }
    }

    public void findBestCoachInTeams(Set<Coach> coachesOfTeam){

        for (Coach coach : coachesOfTeam) {
            Coach coaches = coachesOfTeam.stream().max(Comparator.comparing(Coach::getYearsOfExperience)).get();
            System.out.println("Most experienced coach: " + coaches.getName() + " with " + coaches.getYearsOfExperience() + " years of experience");
            break;
        }
    }

    public void findBestWinningTeam(List<Team> teamWins){

        for (int i = 0; i < teamWins.size(); i++) {
            Team teamWithMostWins = teamWins.stream().max(Comparator.comparing(Team::getWins)).get();
            System.out.println("The best team with win record is " + teamWithMostWins.getName() + " with " + teamWithMostWins.getWins() + " wins");
            break;
        }
    }

    public void findBestLosingTeam(List<Team> teamLosses){

        for (int i = 0; i < teamLosses.size(); i++) {
            Team teamWithMostWins = teamLosses.stream().min(Comparator.comparing(Team::getWins)).get();
            System.out.println("The best team with loss record is " + teamWithMostWins.getName() + " with " + teamWithMostWins.getWins() + " loss");
            break;
        }
    }

    public void sortTeamByPointsPerGame(List<Team> teamSort){

   
    }
}




