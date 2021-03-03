package SecondDay.Assigment2;

import java.util.Set;

public class Player extends Person {

    private double pointPerGame;
    private double assistsPerGame;
    private double reboundsPerGame;

    public Player(String name, int age, int salary) {
        super(name, age, salary);
    }

    public Player(String name, int age, int salary, double pointPerGame, double assistsPerGame, double reboundsPerGame) {
        super(name, age, salary);
        this.pointPerGame = pointPerGame;
        this.assistsPerGame = assistsPerGame;
        this.reboundsPerGame = reboundsPerGame;
    }

    public double getPointPerGame() {
        return pointPerGame;
    }

    public void setPointPerGame(int pointPerGame) {
        this.pointPerGame = pointPerGame;
    }

    public double getAssistsPerGame() {
        return assistsPerGame;
    }

    public void setAssistsPerGame(int assistsPerGame) {
        this.assistsPerGame = assistsPerGame;
    }

    public double getReboundsPerGame() {
        return reboundsPerGame;
    }

    public void setReboundsPerGame(int reboundsPerGame) {
        this.reboundsPerGame = reboundsPerGame;
    }

    @Override
    public String toString() {
        return getName() +
                " pointPerGame=" + pointPerGame +
                ", assistsPerGame=" + assistsPerGame +
                ", reboundsPerGame=" + reboundsPerGame +
                '}';
    }
}
