package units;

import actions.Shot;

import java.util.ArrayList;

public class Sniper extends Unit implements Shot {
    int agility;    //ловкость
    int stamina;
    int capacityQuiver;
    int numArrows;

    public Sniper(String name, int x, int y) {
        super(name, 25, 35, 5, 15, "bow", x, y);
        this.agility = 10;
        this.stamina = 40;
        this.capacityQuiver = 7;
        this.numArrows = 7;
    }

//    public double nearestEnemy(ArrayList<Unit> enemy) {
//        double distance;
//        enemy.
//
//        return distance;
//    }

    @Override
    public void shot(Unit unit) {
        unit.health -= agility;
        stamina -= 10;
    }

    @Override
    public void rest() {
        this.stamina += 4;
    }
}
