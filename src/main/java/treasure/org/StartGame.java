package treasure.org;

import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {
        System.out.print("Enter grid size: ");
        int gridSize = new Scanner(System.in).nextInt();
        GameManager gameManager = new GameManager(gridSize);
        gameManager.play();
    }
}
