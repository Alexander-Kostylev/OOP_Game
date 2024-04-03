package units;

import actions.Steal;

public class Robber extends BaseMelee implements Steal {
    int numSteal;

    public Robber(String name, int x, int y) {
        super(name, 27, 40, 10, 20, "knife", x, y, 40, 5);
        this.numSteal = 5;
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
