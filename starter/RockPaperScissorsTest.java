/**
 * TODO:  Add your name, ID, and email as specified in the instructions
 */

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.*;

public class RockPaperScissorsTest {

    @Test
    public void playSanity_v() throws IOException {
        RockPaperScissors testGame = new RockPaperScissors();

        testGame.play("p", "r");
        testGame.play("r", "s");
        testGame.play("s", "p");

        String[] ans = {"p", "r", "s"};
        assertArrayEquals(testGame.userMoves.toArray(), ans);
        assertEquals(testGame.systemMoves.length, 5);
    }

    @Test
    public void expandCapacitySanity_v() throws IOException {
        RockPaperScissors testGame = new RockPaperScissors();
        testGame.play("p", "r");
        testGame.play("r", "s");
        testGame.play("s", "p");
        testGame.play("p", "r");
        testGame.play("r", "s");
        testGame.play("s", "p");

        assertEquals(testGame.systemMoves.length, 10);
    }

    @Test
    public void checkCounters_v() throws IOException {
        RockPaperScissors testGame = new RockPaperScissors();
        System.out.println(testGame.playerWin.getCount());
        testGame.play("p", "r");
        testGame.play("r", "s");
        testGame.play("s", "p");
        testGame.play("s", "r");
        testGame.play("p", "s");
        testGame.play("r", "p");

        assertEquals(testGame.totalGames.getCount(), 6);
        assertEquals(testGame.playerWin.getCount(), 3);
        assertEquals(testGame.cpuWin.getCount(), 3);
    }
}