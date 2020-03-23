/**
 * Class RockPaperScissors.  Plays repeated games of Rock Paper Scissors with a user 
 * @author Your Name
 * @date The date
 * */

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    static String[] systemMoves;
    static LinkedList<String> userMoves;
    static int initialCapacity = 5;
    static Counter totalGames;
    static Counter playerWin;
    static Counter cpuWin;

    static String gen_cpu_move() {
        //TODO: Generate CPU move. Move is represented by "r"/"p"/"s".
    }

    public static void main( String[] args )
    {

        // Store the total number of games played.
        totalGames = new Counter();
        // Store the number of times player wins.
        playerWin = new Counter();
        // Store the number of times cpu wins.
        cpuWin = new Counter();
        // Store the System's move history
        systemMoves = new String[initialCapacity];
        // Store the user's move history
        userMoves = new LinkedList<String>();

        // TODO: Write code for the game.
    }
}