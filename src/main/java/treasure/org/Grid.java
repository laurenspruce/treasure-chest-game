package treasure.org;

public class Grid implements IGrid {
    private int[][] grid;
    private int treasureX;
    private int treasureY;

    @Override
    public void initialize(int size) {
        grid = new int[size][size]; // Create a grid of given size
    }

    @Override
    public void placeTreasure(int x, int y) {
        this.treasureX = x;
        this.treasureY = y;
    }

    @Override
    public int getTreasureDistance(Player player) {
        int playerX = player.getX();
        int playerY = player.getY();
        // Calculate the Manhattan distance
        return Math.abs(playerX - treasureX) + Math.abs(playerY - treasureY);
    }
}