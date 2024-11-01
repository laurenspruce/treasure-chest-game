package treasure.org;

import java.util.Random;

public class Grid implements IGrid{

    private int size;
    private int treasureX, treasureY;

    @Override
    public void initialise(int size){
        this.size = size;
        placeTreasure();
    }

    @Override
    public void placeTreasure(){
        Random random = new Random();
        treasureX = random.nextInt(size);
        treasureY = random.nextInt(size);
    }

    @Override
    public int getTreasureDistance(int playerX, int playerY){
        return Math.abs(treasureX - playerX) + (treasureY - playerY);
    }

}
