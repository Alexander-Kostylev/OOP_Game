package units;

import actions.Attack;
import actions.Steal;

public class Robber extends Unit implements Attack, Steal {
    int stamina;
    int power;
    int numSteal;

    public Robber(String name, int x, int y) {
        super(name, 27, 40, 10, 20, "knife", x, y);
        this.stamina = 40;
        this.power = 5;
        this.numSteal = 5;

    }

    @Override
    public void attack(Unit unit) {
        unit.health -= power;
    }

    @Override
    public void steal(Unit unit) {
        unit.gold -= numSteal;
    }

    @Override
    public void rest() {
        this.stamina += 4;
    }
}
