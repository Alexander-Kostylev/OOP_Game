package actions;

import units.Unit;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Unit> enemy, ArrayList<Unit> friends);
}
