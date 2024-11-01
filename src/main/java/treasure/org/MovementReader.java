package treasure.org;

public class MovementReader {
    private IReader reader;

    public MovementReader(IReader reader) {
        this.reader = reader;
    }

    public String getMovement() {
        System.out.print("Enter movement (up, down, left, right): ");
        return reader.readInput();
    }
}
