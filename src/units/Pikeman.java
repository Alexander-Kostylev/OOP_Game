package units;

import actions.SpearAttack;

public class Pikeman extends BaseMelee implements SpearAttack {

    public Pikeman(String name, int x, int y) {
        super(name, 27, 60, 20, 30, "spear",
                x, y, 60, 10);
    }

    @Override
    public void spearAttack(Unit unit) {
        unit.health -= power * 2;
        this.stamina -= 40;
    }

    @Override
    public void rest() {
        this.stamina += 10;
    }

}
