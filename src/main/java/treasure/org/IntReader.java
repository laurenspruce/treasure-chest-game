package treasure.org;

import java.util.Scanner;

public class IntReader implements IReader {
    private Scanner scanner;

    public IntReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String readInput() {
        return scanner.nextLine();
    }
}
