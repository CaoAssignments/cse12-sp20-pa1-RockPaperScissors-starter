import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;


public class RockPaperScissorsTest {

    @Test
    public void mainSanity_v() throws IOException {
        String[] args = null;
        final InputStream original = System.in;

        String initialString = "p\np\nq\n";
        final InputStream fips = new ByteArrayInputStream(initialString.getBytes());

        System.setIn(fips);
        RockPaperScissors.initialCapacity=3;
        RockPaperScissors.main(args);
        System.setIn(original);

        String[] ans = {"p", "p"};
        assertArrayEquals(RockPaperScissors.userMoves.toArray(), ans);
        assertEquals(RockPaperScissors.systemMoves.length, 3);
    }

    @Test
    public void checkDoubling_v() throws IOException {
        String[] args = null;
        final InputStream original = System.in;

        String initialString = "r\nr\nr\nr\nq\n";
        final InputStream fips = new ByteArrayInputStream(initialString.getBytes());

        System.setIn(fips);
        RockPaperScissors.initialCapacity=3;
        RockPaperScissors.main(args);
        System.setIn(original);

        assertEquals(RockPaperScissors.systemMoves.length, 6);
    }

    @Test
    public void checkCounter_v() throws IOException {
        String[] args = null;
        final InputStream original = System.in;

        String initialString = "r\nr\nr\nr\nr\nr\nr\nr\nr\nr\nr\nr\nq\n";
        final InputStream fips = new ByteArrayInputStream(initialString.getBytes());

        System.setIn(fips);
        RockPaperScissors.main(args);
        System.setIn(original);

        assertEquals(RockPaperScissors.totalGames.getCount(), 12);

    }
}