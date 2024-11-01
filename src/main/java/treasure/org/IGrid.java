package treasure.org;

public interface IGrid {
    void initialize(int size);
    void placeTreasure(int x, int y);
    int getTreasureDistance(Player player);
}
