package units;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private int posX, posY;
    private final int width = 10; // по X
    private final int height = 10; // по Y

    public Position(int x, int y) {
        posX = x;
        posY = y;
    }


    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }


    private boolean isMoveable(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }

    public void move(int x, int y) {
        if (isMoveable(posX + x, posY + y)) {
            posX += x;
            posY += y;
        }
    }

    public double getDistance(Position target) {
        return Math.sqrt(Math.pow(target.posX - posX, 2) + Math.pow(target.posY - posY, 2));
    }

    public Position getDelta(Position target) {
        return new Position(target.getPosX() - posX, target.getPosY() - posY);
    }


    public void add(int dX, int dY) {
        posX += dX;
        posY += dY;
    }

    public boolean check(Position pos) {
        return pos.posX == posX && pos.posY == posY;
    }
}
