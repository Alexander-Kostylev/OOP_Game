package units;

import actions.Shot;

public class Crossbowman extends Unit implements Shot {
    int agility;    //ловкость
    int stamina;
    int capacityQuiver;
    int numBolt;
    public Crossbowman(String name, int age) {
        super(name, age, 45, 10, 30, "crossbow");
        this.agility=5;
        this.stamina=30;
        this.capacityQuiver = 5;
        this.numBolt = 5;
    }

    @Override
    public void rest() {
        this.stamina += 7;
    }

    @Override
    public void shot(Unit unit) {
        unit.health -= agility;
        stamina -= 4;
    }
}