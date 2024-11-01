package treasure.org;

import java.util.Random;

public class Monster implements IMonster {
    private String name;
    private int x;
    private int y;
    private Random random;

    public Monster(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.random = new Random();
    }

    @Override
    public String greet() {
        return "A wild " + name + " appears!";
    }

    @Override
    public void move() {
        // Logic to move the monster randomly
        System.out.println(name + " is moving around.");
        int direction = random.nextInt(4);
        switch (direction) {
            case 0: y--; break; // Move up
            case 1: y++; break; // Move down
            case 2: x--; break; // Move left
            case 3: x++; break; // Move right
        }
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getName() {
        return name;
    }
}
