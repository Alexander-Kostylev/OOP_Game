import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        holyTeam = createTeam(0);
        darkTeam = createTeam(3);

        System.out.println(holyTeam);
        System.out.println("=================================================");
        System.out.println(darkTeam);
        System.out.println("=================================================");

        // поиск ближайших целей стрелков команды holyTeam
       for (int i = 0; i <holyTeam.size(); i++) {
           if (holyTeam.get(i) instanceof Crossbowman)
               System.out.println(holyTeam.get(i).nearestEnemy(darkTeam));
       }
    }

    public static ArrayList<Unit> holyTeam;
    public static ArrayList<Unit> darkTeam;

    private static ArrayList<Unit> createTeam(int num) {
        ArrayList<Unit> team = new ArrayList<Unit>();
        int teamCount = 10;
        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(4) + num) {
                case 0:
                    team.add(new Wizard(fillName(), 0, i));
                    break;
                case 1:
                    team.add(new Crossbowman(fillName(), 0, i));
                    break;
                case 2:
                    team.add(new Pikeman(fillName(), 0, i));
                    break;
                case 3:
                    team.add(new Peasant(fillName(), (3 * num), i));
                    break;
                case 4:
                    team.add(new Sniper(fillName(), 9, i));
                    break;
                case 5:
                    team.add(new Monk(fillName(), 9, i));
                    break;
                case 6:
                    team.add(new Robber(fillName(), 9, i));
                    break;
            }

        }

        return team;
    }

    private static String fillName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}