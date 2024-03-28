package units;

import actions.Shot;

import java.util.ArrayList;

public class Crossbowman extends Unit implements Shot {
    private int agility;    //ловкость
    private int stamina;
    private int capacityQuiver;
    private int numBolt;
    private int damage;

    public Crossbowman(String name, int x, int y) {
        super(name, 25, 45, 10, 30, "crossbow", x, y);
        this.agility = 5;
        this.stamina = 30;
        this.capacityQuiver = 5;
        this.numBolt = 5;
        this.damage = 10;
        this.speed = 3;
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

    @Override
    public void step(ArrayList<Unit> units) {
        if (numBolt > 0 && isLife()) {
            nearestEnemy(units).health -= damage;
            numBolt--;
        }
    }

    public int getBolts(){
        return numBolt;
    }

    private boolean isLife() {
        return (this.health > 0);
    }

}
