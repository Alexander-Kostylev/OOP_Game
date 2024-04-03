package units;

import actions.GameInterface;

import java.util.ArrayList;

public abstract class BaseMelee extends Unit implements GameInterface {
    protected int stamina;
    protected int power;


    public BaseMelee(String name, int age, int health, int defense, int gold,
                     String weapon, int x, int y, int stamina, int power) {
        super(name, age, health, defense, gold, weapon, x, y, 2);
        this.stamina = stamina;
        this.power = power;
    }

    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friends) {
        Unit target = nearestEnemy(enemy);
        if (health <= 0 || target == null) return;

        if (position.getDistance(target.position) < 2) {
            attack(target);
        } else {
            move(target, friends);
        }
    }

    private void attack(Unit enemy) {
        enemy.health -= power;
    }

    private void move(Unit enemy, ArrayList<Unit> friends) {
        Position delta = position.getDelta(enemy.position);
        Position newPos = new Position(position.getPosX(), position.getPosY());

        int dX = delta.getPosX();
        if (dX != 0) {
            dX = Math.abs(dX) / dX;
        }
        int dY = delta.getPosY();
        if (dY != 0) {
            dY = Math.abs(dY) / dY;
        }
        if (dX != 0 && dY != 0){
            dY = 0;
        }

        newPos.add(dX, dY);

        for (Unit unit : friends){
            if (unit.position.check(newPos)){
                return;
            }
        }

        position = newPos;
    }

    public int getSpeed() {
        return this.speed;
    }
}
