import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // создание 2-х команд
        holyTeam = createTeam(0);
        darkTeam = createTeam(3);

        //вывод состав команд
        System.out.println(holyTeam);
        System.out.println("=================================================");
        System.out.println(darkTeam);
        System.out.println("=================================================");


        // поиск ближайших целей стрелков команды holyTeam и выстрел по ближайшему противнику
        for (int i = 0; i < holyTeam.size(); i++) {
            if (holyTeam.get(i) instanceof Crossbowman) {
                System.out.println("До выстрела здоровье цели: " + darkTeam.get(i).getHealth());
                System.out.println("Количество выстрелов до действия: " + ((Crossbowman) holyTeam.get(i)).getBolts());
                holyTeam.get(i).step(darkTeam);
                System.out.println("Количество выстрелов после действия: " + ((Crossbowman) holyTeam.get(i)).getBolts());
                System.out.println("После выстрела здоровье цели:" + darkTeam.get(i).getHealth());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }

        // Определение очередности ходов.
        // Создали общий список со всеми юнитами из 2-х команд. Сортировка по скорости. Вывод всех юнитов.
        ArrayList<Unit> allUnits = new ArrayList<>(holyTeam); // Все юниты с обеих команд
        allUnits.addAll(darkTeam);
        allUnits.sort((t1, t2) -> t2.speed - t1.speed);
        System.out.println(allUnits);
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