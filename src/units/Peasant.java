package units;

import actions.GiveArrow;
import actions.Shot;

public class Peasant extends Unit implements GiveArrow {
    int arrowsInBag;
    int capacityBag;
    int stamina;
    public Peasant(String name, int x, int y) {
        super(name, 20, 15, 2, 5, "nothing", x, y);
        this.arrowsInBag = 3;
        this.capacityBag = 3;
        this.stamina = 20;
    }

    @Override
    public void giveArrow(Unit unit) {
        if (unit instanceof Shot){
            arrowsInBag --;
        }
        else System.out.println("У персонажа нет дальнобойного оружия");
    }

    @Override
    public void rest() {
        this.stamina += 2;
    }
}
