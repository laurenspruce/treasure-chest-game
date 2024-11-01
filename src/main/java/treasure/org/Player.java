package treasure.org;

public class Player {
    private int x;
    private int y;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Update move methods to change position
    public void moveUp() {
        y--; // Move up decreases y-coordinate
    }

    public void moveDown() {
        y++; // Move down increases y-coordinate
    }

    public void moveLeft() {
        x--; // Move left decreases x-coordinate
    }

    public void moveRight() {
        x++; // Move right increases x-coordinate
    }
}
