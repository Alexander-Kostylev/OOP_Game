package units;

import actions.GameInterface;
import actions.Shot;

import java.util.ArrayList;

public abstract class BaseShooter extends Unit implements GameInterface, Shot {

    protected int agility;    //ловкость
    protected int stamina;
    protected int numShot;
    protected int damage;

    public BaseShooter(String name, int age, int health, int defense, int gold,
                       String weapon, int x, int y, int agility, int stamina, int numShot, int damage) {
        super(name, age, health, defense, gold, weapon, x, y, 3);
        this.agility = agility;
        this.stamina = stamina;
        this.numShot = numShot;
        this.damage = damage;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friends) {
        if (numShot > 0 && isLife()) {
            nearestEnemy(enemy).health -= damage;
            numShot--;
        }
    }

    public int getNumShot(){
        return numShot;
    }

    private boolean isLife() {
        return (this.health > 0);
    }

    public int getSpeed(){
        return this.speed;
    }
}
