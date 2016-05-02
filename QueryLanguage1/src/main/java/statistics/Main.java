package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

        System.out.println("Väh: 10 goal, väh 10 assists");

        Matcher m = new And(new HasAtLeast(10, "goals"),
                new HasAtLeast(10, "assists"),
                new PlaysIn("PHI")
        );

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }

        System.out.println("\nEnintään 10 goal, vähintään 10 assists");

        m = new And(new HasFewerThan(10, "goals"),
                new HasAtLeast(10, "assists"),
                new PlaysIn("PHI")
        );

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }

        System.out.println("\nVah: 30 goal, tai Vah: 30 assists");

        m = new And(new Or(new HasAtLeast(30, "goals"),
                new HasAtLeast(30, "assists")),
                new PlaysIn("PHI")
        );

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }

        System.out.println("\n\nEi (Vähintään 30 goal, väh 30 assists)");

        m = new And(new Not(new HasAtLeast(30, "goals")),new Not(
                 new HasAtLeast(30, "assists")), 
                new PlaysIn("PHI"));
        
        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }
}
