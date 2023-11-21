package Factory2;

import java.util.Objects;
public class MainFactory {
    public static void main(String[] args) {
        League l1 = LeagueFactory.getLeague("A");
        Objects.requireNonNull(l1).showInfo();
        League l2 = LeagueFactory.getLeague("B");
        Objects.requireNonNull(l2).showInfo();
    }
}