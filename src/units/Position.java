package units;

import java.util.ArrayList;
import java.util.List;

public class Position  {
    private int posX, posY;

    public Position(int x, int y) {
        this.posX = x;
        this.posY = y;
    }



    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public double getDistance(Position target){
        return Math.sqrt(Math.pow(target.posX - posX, 2) + Math.pow(target.posY - posY, 2));
    }
}
