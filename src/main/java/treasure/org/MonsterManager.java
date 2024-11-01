package treasure.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterManager {
    private List<IMonster> monsters;
    private Random random;

    public MonsterManager() {
        this.monsters = new ArrayList<>();
        this.random = new Random();
    }

    public void spawnMonster(String name, int gridSize) {
        // Spawn a monster at a random position within the grid size
        int x = random.nextInt(gridSize);
        int y = random.nextInt(gridSize);
        IMonster monster = new Monster(name, x, y); // Pass coordinates
        monsters.add(monster);
        System.out.println(monster.greet() + " at (" + x + ", " + y + ")");
    }

    public void moveMonsters() {
        for (IMonster monster : monsters) {
            monster.move();
        }
    }

    public List<IMonster> getMonsters() {
        return monsters;
    }
}
