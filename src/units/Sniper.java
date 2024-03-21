package units;

import actions.Shot;

public class Sniper extends Unit implements Shot {
    int agility;    //ловкость
    int stamina;
    int capacityQuiver;
    int numArrows;

    public Sniper(String name, int age) {
        super(name, age, 35, 5, 15, "bow");
        this.agility = 10;
        this.stamina = 40;
        this.capacityQuiver = 7;
        this.numArrows = 7;
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
