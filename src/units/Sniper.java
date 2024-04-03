package units;

import actions.Shot;

import java.util.ArrayList;

public class Sniper extends BaseShooter{

    public Sniper(String name, int x, int y) {
        super(name, 25, 35, 5, 15, "bow", x, y, 10,40,7,7);
    }

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
