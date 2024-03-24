package units;

import actions.Healing;
import actions.Revive;

public class Monk extends Unit implements Healing, Revive {
    int mana;
    int intellect;
    public Monk(String name, int x, int y) {
        super(name, 55, 40, 7, 20,"scroll", x, y);
        this.mana = 20;
        this.intellect = 5;
    }

    @Override
    public void rest() {
        mana += 5;
    }

    @Override
    public void healing(Unit unit) {
        unit.health += 5;
        mana -= 7;
    }

    @Override
    public void revive(Unit unit) {
        unit.health += 25;
        mana -= 18;
    }
}
