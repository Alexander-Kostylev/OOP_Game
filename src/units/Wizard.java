package units;

import actions.Curse;
import actions.Magic;

public class Wizard extends Unit implements Curse, Magic {
    int mana;
    int intellect;
    int magicDamage;
    public Wizard(String name, int x, int y) {
        super(name, 40, 25, 3, 40, "stick", x, y);
        this.intellect = 10;
        this.mana = 10;
        this.magicDamage = 3;
    }

    @Override
    public void curse(Unit unit) {
        unit.health -= intellect;
        mana -= 4;
    }

    @Override
    public void magic(Unit unit) {
        unit.health -= magicDamage;
        mana -= 2;
    }

    @Override
    public void rest() {
        this.mana += 3;
    }
}
