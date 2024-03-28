package units;

import actions.Shot;

import java.util.ArrayList;

public class Sniper extends Unit implements Shot {
    private int agility;    //ловкость
    private int stamina;
    private int capacityQuiver;
    private int numArrows;

    private int damage;

    public Sniper(String name, int x, int y) {
        super(name, 25, 35, 5, 15, "bow", x, y);
        this.agility = 10;
        this.stamina = 40;
        this.capacityQuiver = 7;
        this.numArrows = 7;
        this.damage = 7;
        this.speed = 3;
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

    @Override
    public void step(ArrayList<Unit> units) {
        if(numArrows > 0 && isLife()){
            nearestEnemy(units).health -= damage;
            numArrows--;
        }

    }

    private boolean isLife(){return (this.health > 0);}
}
