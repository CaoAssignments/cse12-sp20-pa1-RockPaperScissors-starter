# CSE 12 - Spring 2020 HW #1
## Warm up, and some fun with Rock, Paper, Scissors
### (100 points)
**Due 11:59pm #TODO (updated date)**

### Useful Resources:
Throughout this assignment, you may find the following resources helpful.  Refer to them BEFORE posting questions on Piazza.
- [Connecting to the lab machines remotely](https://docs.google.com/document/d/1AM888aGCagZRQYSY3wgtzboTnHHzLOEnuUgl85_oMJQ/edit)
- [running bash on Windows](https://docs.google.com/document/d/1SMnopsKw0lHWCxkQ0ETgkfLFdfonjGGh4CgfagnFcSU/edit)
- [Unix reference sheet](https://files.fosswire.com/2007/08/fwunixref.pdf)
- [JUnit testing tutorial](https://www.tutorialspoint.com/junit/junit_environment_setup.htm)

### Provided Files:
- Counter.java
- CounterTest.java
- RockPaperScissors.java
- RockPaperScissorsTest.java

### Files to Submit:
- Counter.java
- CounterTest.java
- RockPaperScissors.java


### Goal:
For you to become comfortable using an #TODO (reword)  Integrated Development Environment (IDE) (e.g. Eclipse), the Unix command line, gain familiarity with turn-in procedures, learn some basics of unit testing with JUnit, implement a few modest-sized programming problems using Arrays, ArrayLists, LinkedLists and Iterators from the Java Collections Framework.


### Logistics:
In EACH AND EVERY FILE that you turn in, we need the following in comments at the top of each file.  These are essential so that we can more easily process your submissions and ensure that you receive proper credit. This is a very large class with about 700 students when combining both lectures. **No name, no points**. 

NAME: <your name>  
ID: <your student ID>  
EMAIL: <your email>  

### How to submit your homework
Instructions on how to submit your assignment will be posted on Piazza on #TODO (updated date)  Wednesday (10/3).

## Getting Started
We strongly recommend that you work on the lab machines ([for remote access--see instructions here](https://docs.google.com/document/d/1AM888aGCagZRQYSY3wgtzboTnHHzLOEnuUgl85_oMJQ/edit?usp=sharing)), but if you choose to work on your own machine, make sure your code runs correctly on ieng6, as that is where we will be testing it. Instructions below assume you are using the lab machines.  
Create a subdirectory call “pa1” in your class account.  All of your files for this assignment should be placed in that subdirectory.  If you cannot remember how to create directories, refer to a [unix tutorial](http://www.ee.surrey.ac.uk/Teaching/Unix/) or [reference sheet](https://files.fosswire.com/2007/08/fwunixref.pdf).  

## Problem #0
Read and sign the Integrity of Scholarship agreement for CSE 12 #TODO (updated link) [here](https://docs.google.com/forms/d/e/1FAIpQLScMkRaNI344aWqNjcDTnaiEz4DLevhO8eTDRGAKW_ffxp164Q/viewform). **You cannot earn any credit in CSE 12 until you have done so.**

## Problem #1 (40  points) 
The purpose of this problem is to get you comfortable with JUnit 4 on the command line.  You may use any program you like to edit your java files (e.g., Dr. Java, vim, Notepad++, or even Eclipse), but we would like you to compile the program and run the JUnit tests from the command line.

Clone/download the files from [this GitHub repository](https://github.com/CaoAssignments/cse12sp20-pa1-starter).
- For more information on how to use GitHub to retrieve the files refer to [this documentation](https://drive.google.com/file/d/1GYDOmK5i1fUK_vLGY6C25G59chw79Tt_/view?usp=sharing).

You will write JUnit tests and run them from the command line. If you are working on your own machine, follow the [instructions here](https://www.tutorialspoint.com/junit/junit_environment_setup.htm) to install **JUnit 4** (NOT JUnit 5) on your own machine.  Note that these instructions omit the step where you need to add the hamcrest-core file to your CLASSPATH (you need to do this or you will get a compile error).  
Now, open the CounterTest.java file in an editor.  Most of this file is already complete, and you should be able to compile and run it (see below).   However, there are some ‘TODO:’  marked in comments where you are to complete the code. These completions include adding comments at the top of the file and completing the code to properly run some of the unit tests against the Counter class.  When you run the unit tests, they should make reasonable tests and print out the following when running the JUnitCore TestRunner.

```
.Checking Default Counter Value is Zero
.Checking Proper Increment
.Checking Multiple Increments
.Checking Reset
.Checking Decrement

Time: 0.002

OK (5 tests)
```

Here’s what to do for this part:
1. First, complete the TODO items in CounterTest.java.
2. Next, run all of the tests from the command line.  You will need to figure out the proper sequence of commands to do this. Feel free to talk to a tutor/TA or to use Google for help. 
3. Finally, modify Counter.java so that your Reset test fails.  The version  of Counter.java that does not pass the Reset test is the version you should turn in. To be clear, Counter.java must compile but it should fail a reasonable Reset test.  We will run your tests against an error-free version of Counter.java to ensure that all tests pass. Then we will run your tests against your turned in version of Counter.java to see the failed Reset test. 

## Problem #2 (60 points)
In this problem you will create a computer game to play the game of Rock-Paper-Scissors with a user.  If you are unfamiliar with this game, you can read about it on [Wikipedia here](http://en.wikipedia.org/wiki/Rock-paper-scissors).  

We have provided a tiny bit of starter code.  Copy the following from the the public folder:  
RockPaperScissors.java  
    RockPaperScissorsTest.java
    
When the user starts your game, it should play the game of Rock Paper Scissors with the user until the user types ‘q’.  Here is an example run.  User input is after the "(r=rock, p=paper, s=scissors or q to quit)".
    
```
> java RockPaperScissors
Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)
r
I choose rock. It's a tie
Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)
p
I choose paper. It's a tie
Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)
g
That is not a valid move.  Please try again.
(r=rock, p=paper, s=scissors or q to quit)
p
I choose rock. You win.
Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I choose rock. I win!
Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)
r
I choose rock. It's a tie
Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I choose paper. You win.
Let's play!  What's your move? (r=rock, p=paper, s=scissors or q to quit)
q
Thanks for playing!
Our most recent games (in reverse order) were:
Me: paper   You: scissors
Me: rock    You: rock
Me: rock    You: scissors
Me: rock    You: paper
Me: paper   You: paper
Me: rock    You: rock
Our overall stats are:
I won: 16%   	You won 33% 	We tied: 50%
```

Your exact formatting doesn’t have to match ours, but the game play and which statistics are printed at the end should match.  (Though of course, the exact values of the statistics will depend on the user’s and system’s moves in any given game!)

Here are some detailed requirements of the game play and specifics about the program:
* You will write your code in the main method and use the gen_cpu_move helper method to implement the cpu’s logic, but you should use good style and helper functions as needed.  However, please **do not** alter the provided variable names and use them in your implementation. We will test your code using these variable names.
* The game should repeat until the user enters ‘q’
* The game should track the full move history for both players.  It should store the move history of the system in an array of Strings and the move history of the user in a LinkedList of Strings.  These variables are already set up in the starter code.  You just need to use them.
* The array that stores the system’s moves is initialized to size 5.  As the system enters more moves than the array can hold, you should write code to expand this array (really, to make a new array and copy over the contents of the old one).  The new array should always be twice the size of the old array.  E.g. on the 6th move, the array becomes size 10, on the 11th move it becomes size 20, etc.  You must do this resizing and copying “from scratch”.  That is, you have to write the code yourself, and **may NOT use any method in Java’s Arrays class. You will only receive half credit if you do.**
* At the end of the game, the system should print out up to the last 10 games, in reverse order.  If there has not been 10 games, it should print out as many as has been played.  If there have been more than 10 games, it should only print the most recent 10. (But remember, it should store the full game histories).  It should also print the win and tie statistics as in the example.
* Your program should gracefully handle incorrect input by re-prompting the user until they enter valid input.  You can look for the letters r, s and p exactly, or allow more freedom in the input.
* Your programs should generate no exceptions under (almost) any circumstances. Try to break with bad input.
* It’s up to you to decide how the computer player chooses its moves, but the one rule is it cannot cheat.  That is, it cannot look at the user’s move and then decide how to move.  It can, however, look at the user’s move history as well as its own history.  You can do something as simple as having it choose a random move, or the same move, every time.  But if you’d like to get more sophisticated, you should try to make the best player out there by taking into account what you know about how the user plays. It’s amazing how “smart” you can make your program with just a little information.  **If you do get creative here, make sure you document your approach in your header comment at the top of your RockPaperScissors.java file.**
* Feel free to make a more creative version of RPS, for example, [Rock Paper Scissors Lizard Spock](http://www.samkass.com/theories/RPSSL.html) is always fun.  Get creative.  Just make sure it’s easy to understand how to play your game.