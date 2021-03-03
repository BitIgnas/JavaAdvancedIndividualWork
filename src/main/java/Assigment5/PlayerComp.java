package Assigment5;

import SecondDay.Assigment2.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class PlayerComp implements Comparable<Player> {


    public int compareTo(Player p1, Player p2) {
        return Double.compare(p1.getPointPerGame(), p2.getPointPerGame());
    }

    @Override
    public int compareTo(@NotNull Player o) {
        return 0;
    }


}
