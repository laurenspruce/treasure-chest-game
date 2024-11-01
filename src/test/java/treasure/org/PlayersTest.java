package treasure.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayersTest {
    private Player cut;

    @Test
    public void verify_player_moves_right(){

        //Arrange
        int expectedX = 1;
        int expectedY = 0;

        //Act
        cut.move("right");
        int actualX = cut.getX();
        int actualY = cut.getY();

        //Assert
        assertEquals(expectedX,actualX);
        assertEquals(expectedY,actualY);

    }
}
