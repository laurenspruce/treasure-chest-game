package treasure.org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GridTest {
    private IGrid cut;
    private Player mockPlayer;

    @BeforeEach
    void setUp() {
        cut = new Grid();
        cut.initialize(5);
        mockPlayer = mock(Player.class); //Creating a mock player
    }

    @Test
    void verifying_the_treasure_distance(){

        // Arrange
        when(mockPlayer.getX()).thenReturn(2);
        when(mockPlayer.getY()).thenReturn(2);
        cut.placeTreasure(4, 4); // Placing treasure at (4, 4)

        int expectedDistance = 4; // Distance from (2, 2) to (4, 4)

        // Act
        int actualDistance = cut.getTreasureDistance(mockPlayer);

        // Assert
        assertEquals(expectedDistance, actualDistance);
        verify(mockPlayer).getX(); // Verify that getX was called
        verify(mockPlayer).getY(); // Verify that getY was called

    }
}
