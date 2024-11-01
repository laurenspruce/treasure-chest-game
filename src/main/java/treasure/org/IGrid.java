package treasure.org;

public interface IGrid {

    //  Setting up a 2D array
    void initialise(int size);
    void placeTreasure();
    int getTreasureDistance(int playerX, int playerY);


}
