package units;

import actions.Shot;

import java.util.ArrayList;

public class Crossbowman extends BaseShooter{


    public Crossbowman(String name, int x, int y) {
        super(name, 25, 50, 5, 15, "crossbow", x, y,
                7, 25, 5, 15);
    }

    @Override
    public void shot(Unit unit) {
        unit.health -= agility;
        stamina -= 10;
    }

    @Override
    public void rest() {
        stamina += 5;
    }
}
