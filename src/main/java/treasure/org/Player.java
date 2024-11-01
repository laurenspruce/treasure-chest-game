package treasure.org;

public class Player {

    private int x, y;

    public Player (int startX, int startY) {

        this.x = startX;
        this.y = startY;

    }

    public void move (String direction) {
        //Movement logic
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
