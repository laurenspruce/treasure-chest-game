package treasure.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonstersTest {

    private Monsters cut; //Class under test

    @Test
    void testMonsterGreeting(){

        //  Arrange
        cut = new Monsters("Minecraft Spider");
        String expectedGreeting = "A wild Minecraft Spider appears!";

        //  Act
        String actualGreeting = cut.getGreeting();

        //  Assert
        assertEquals(expectedGreeting, actualGreeting);
    }

}
