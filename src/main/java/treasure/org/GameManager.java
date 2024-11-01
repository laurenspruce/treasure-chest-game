package treasure.org;

import java.util.Random;

public class GameManager {
    private Player player;
    private Grid grid;
    private Random random;
    private MonsterManager monsterManager;

    public GameManager(int gridSize) {
        this.grid = new Grid();
        this.grid.initialize(gridSize);
        this.random = new Random();

        // Set the player's starting position randomly
        int startX = random.nextInt(gridSize);
        int startY = random.nextInt(gridSize);
        this.player = new Player(startX, startY);

        // Place treasure randomly on the grid
        this.grid.placeTreasure(random.nextInt(gridSize), random.nextInt(gridSize));

        // Initialize the MonsterManager
        this.monsterManager = new MonsterManager();

        // Spawn monsters at random positions on the grid
        spawnMonsters(gridSize);
    }

    // Spawn monsters at random positions on the grid
    private void spawnMonsters(int gridSize) {
        monsterManager.spawnMonster("Dragon", gridSize);
        monsterManager.spawnMonster("Zombie", gridSize);
        monsterManager.spawnMonster("Skeleton", gridSize);
    }

    public void play() {
        MovementReader movementReader = new MovementReader(new IntReader());

        // Main game loop
        while (true) {
            // Move player based on input
            String movement = movementReader.getMovement();
            movePlayer(movement);

            // Calculate distance to treasure
            int distance = grid.getTreasureDistance(player);
            System.out.println("Distance to treasure: " + distance);

            // Check if player found the treasure
            if (distance == 0) {
                System.out.println("Congratulations! You've found the treasure!");
                break;
            }

            // Move monsters and check for encounters
            monsterManager.moveMonsters();
            if (checkMonsterEncounter()) {
                break; // End the game if a monster catches the player
            }
        }
    }

    private void movePlayer(String movement) {
        switch (movement.toLowerCase()) {
            case "up":
                player.moveUp();
                break;
            case "down":
                player.moveDown();
                break;
            case "left":
                player.moveLeft();
                break;
            case "right":
                player.moveRight();
                break;
            default:
                System.out.println("Invalid move. Try again.");
        }
    }

    private boolean checkMonsterEncounter() {
        for (IMonster monster : monsterManager.getMonsters()) {
            // Check if the player is in the same position as a monster
            if (player.getX() == monster.getX() && player.getY() == monster.getY()) {
                System.out.println(monster.greet()); // Call monster's greeting
                System.out.println("Oh no! A " + monster.getName() + " caught you!");
                return true; // End the game if a monster catches the player
            }
        }
        return false;
    }
}
