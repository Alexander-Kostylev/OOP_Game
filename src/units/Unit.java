package units;

public abstract class Unit {
    String name;
    int age;
    int health;
    int defense;
    int gold;
    String weapon;

    public Unit(String name, int age, int health, int defense, int gold, String weapon) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.defense = defense;
        this.gold = gold;
        this.weapon = weapon;
    }

    public abstract void rest();
    @Override
    public String toString() {
        return ("Class " + this.getClass().getSimpleName() + " name " +name);
    }
}
