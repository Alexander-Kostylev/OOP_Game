package units;

import java.util.ArrayList;

public abstract class Unit {
    protected String name;
    protected int age;
    protected int health;
    protected int defense;
    protected int gold;
    protected String weapon;

    protected Position position;

    public Unit(String name, int age, int health, int defense, int gold, String weapon, int x, int y) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.defense = defense;
        this.gold = gold;
        this.weapon = weapon;
        this.position = new Position(x, y);
    }

    public abstract void rest();

    @Override
    public String toString() {
        return ("Класс " + this.getClass().getSimpleName() + " имя " + name
                + " находится: " + "x=" + position.getPosX() + ", y=" + position.getPosY());
    }

    public Unit nearestEnemy(ArrayList<Unit> enemy){
        double smallestDistance = position.getDistance(enemy.get(0).position);
        int indexEnemy = 0;
        for (int i = 1; i< enemy.size(); i++){
            double tempPosition = position.getDistance(enemy.get(i).position);
            if(tempPosition < smallestDistance){
                smallestDistance = tempPosition;
                indexEnemy = i;
            }
        }
        return enemy.get(indexEnemy);
    }
}
