package SecondDay.Assigment2;


import java.util.Set;
public class Team {
    private String name;
    private Coach coach;
    private Set<Player> players;
    private double pointsPerGame;
    private double assistPerGame;
    private double reboundsPerGame;
    private int wins;
    private int loses;

    public Team(String name, Coach coach, Set<Player> players, int wins, int loses) {
        this.name = name;
        this.coach = coach;
        this.players = players;
        this.pointsPerGame = calculatePointsPerGame();
        this.assistPerGame = calculateAssistsPerGame();
        this.reboundsPerGame = calculateReboundsPerGame();
        this.wins = wins;
        this.loses = loses;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Coach getCoach() {
        return coach;
    }
    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    public Set<Player> getPlayers() {
        return players;
    }
    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
    public double getPointsPerGame() {
        return pointsPerGame;
    }
    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
    public double getAssistPerGame() {
        return assistPerGame;
    }
    public void setAssistPerGame(double assistPerGame) {
        this.assistPerGame = assistPerGame;
    }
    public double getReboundsPerGame() {
        return reboundsPerGame;
    }
    public void setReboundsPerGame(double reboundsPerGame) {
        this.reboundsPerGame = reboundsPerGame;
    }
    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    public int getLoses() {
        return loses;
    }
    public void setLoses(int loses) {
        this.loses = loses;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", coach=" + coach +
                ", players=" + players +
                ", ppg=" + pointsPerGame +
                ", apg=" + assistPerGame +
                ", rpg=" + reboundsPerGame +
                ", wins=" + wins +
                ", loses=" + loses +
                '}';
    }
    public double calculatePointsPerGame() {
        double sum = 0;
        for (Player player : players) {
            sum += player.getPointPerGame();
        }
        return sum;
    }
    public double calculateAssistsPerGame() {
        double sum = 0;
        for (Player player : players) {
            sum += player.getAssistsPerGame();
        }
        return sum;
    }
    public double calculateReboundsPerGame() {
        double sum = 0;
        for (Player player : players) {
            sum += player.getReboundsPerGame();
        }
        return sum;
    }
}

