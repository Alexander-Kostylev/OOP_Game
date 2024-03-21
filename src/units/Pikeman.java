package units;

import actions.Attack;
import actions.SpearAttack;

public class Pikeman extends Unit implements Attack, SpearAttack {
    int stamina;
    int power;

    public Pikeman(String name, int age) {
        super(name, age, 60, 20, 30, "spear");
        this.stamina = 60;
        this.power = 10;
    }

    @Override
    public void attack(Unit unit) {
        unit.health -= power;
        this.stamina -= 10;
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
