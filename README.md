# CSE 12 Spring 2020 PA1 - Warm up, and some fun with Rock, Paper, Scissors (100 points)

**Due date: Monday, April 6 @ 11:59PM PDT**  
(Tuesday, April 7 @ 11:59pm PDT w/ slip day)
### Useful Resources:
Throughout this assignment, you may find the following resources helpful.  Refer to them BEFORE posting questions on Piazza.
- [Connecting to the lab machines remotely](https://drive.google.com/file/d/1I7b7QXRVCL2rjgiLU9XbWDFa03g9AIjc/view?usp=sharing)
- [running bash on Windows](https://drive.google.com/file/d/1bFXllnDhmDjTE5831Zxs8-ooIbHlpPQG/view?usp=sharing)
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
The goal of this assignment is to re-familiarize yourself with the command line, IDEs/text editors, and Java. Additionally, you will gain familiarity with the course turn-in procedures, learn basics of unit testing with JUnit, and implement a few modest-sized programming problems using Arrays and ArrayLists from the Java Collections Framework.


### Logistics:
In EACH AND EVERY FILE that you turn in, we need the following in comments at the top of each file.  These are essential so that we can more easily process your submissions and ensure that you receive proper credit. This is a very large class with about 700 students when combining both lectures. **No name, no points**. 

NAME: &lt;your name&gt;\
ID: &lt;your student ID&gt;\
EMAIL: &lt;your email&gt;


## Getting Started
We strongly recommend that you work on the lab machines ([for remote access--see instructions here](https://drive.google.com/file/d/1I7b7QXRVCL2rjgiLU9XbWDFa03g9AIjc/view?usp=sharing)), but if you choose to work on your own machine, make sure your code runs correctly on ieng6, as that is where we will be testing it. Instructions below assume you are using the lab machines.  
Create a subdirectory call “pa1” in your class account.  All of your files for this assignment should be placed in that subdirectory.  If you cannot remember how to create directories, refer to a [unix tutorial](http://www.ee.surrey.ac.uk/Teaching/Unix/) or [reference sheet](https://files.fosswire.com/2007/08/fwunixref.pdf).  


## Style
On this assignment, we will give you feedback on style but not deduct points for problems with style. For future assignments, we will be grading the following for style on all files you submit:

1. File header
2. Class header
3. Method header(s)
4. Inline comments
5. Proper indentation
6. Descriptive variable names
7. No magic numbers (Exception: Magic numbers can be used for testing.)
8. Reasonably short methods (if you have implemented each method according to specification in this write-up, you’re fine). This is not enforced as strictly.
9. Lines shorter than 80 characters
10. Javadoc conventions (@param, @return tags, /** comments */, etc.)  

A full [style guide](https://sites.google.com/view/cse12spr20/style-guide) can be found here. If you need any clarifications, feel free to ask on Piazza.


## Problem #0
Read and sign the Integrity of Scholarship agreement for CSE 12 [here](https://forms.gle/KacmAMaa9MHNftti8). **You cannot earn any credit in CSE 12 until you have done so.**


## Problem #1 (10  points) 
The purpose of this problem is to get you comfortable with [JUnit 4](https://junit.org/junit4/) on the command line.  You may use any program you like to edit your java files (e.g., Dr. Java, vim, Notepad++, or even Eclipse), but we would like you to compile the program and run the JUnit tests from the command line.

Clone/download the files from [this GitHub repository](https://github.com/CaoAssignments/cse12sp20-pa1-starter).
- For more information on how to use GitHub to retrieve the files refer to [this documentation](https://drive.google.com/file/d/1GYDOmK5i1fUK_vLGY6C25G59chw79Tt_/view?usp=sharing).

For this problem, you will write JUnit tests and run them from the command line. We will be running the JUnit tests by specifying the necessary .jar files (contained in the lib directory of this PA) in our classpath when compiling and executing. This allows the Java runtime environment to search for classes and necessary resource files (read more about this [here](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/classpath.html)).

Now, open the CounterTest.java file in an editor. Most of this file is already complete, and you should be able to compile and run it (see below). However, there are some ‘TODO:’ marked in comments where you are to complete the code. These completions include adding comments at the top of the file and completing the code to properly run some of the unit tests against the Counter class. When you run the unit tests, they should make reasonable tests and print out the following.

Running on UNIX based systems:
- Compile: `javac -cp ../libs/junit-4.12.jar:../libs/hamcrest-core-1.3.jar:. Counter.java CounterTest.java`
- Execute: `java -cp ../libs/junit-4.12.jar:../libs/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore CounterTest`

Running on Windows systems:
- Compile: `javac -cp ..\libs\junit-4.12.jar;..\libs\hamcrest-core-1.3.jar; Counter.java CounterTest.java`
- Execute: `java -cp ..\libs\junit-4.12.jar;..\libs\hamcrest-core-1.3.jar; org.junit.runner.JUnitCore CounterTest`

Running these commands will result in output like this:

```
.Checking Default Counter Value is Zero
.Checking Proper Increment
.Checking Multiple Increments
.Checking Reset
.Checking Decrement

Time: 0.002

OK (5 tests)
```

Steps to complete for this problem:
1. First, complete the TODO items in CounterTest.java.
2. Next, run all of the tests from the command line. 
3. Finally, modify Counter.java so that your Reset test fails.  The version  of Counter.java that does **not** pass the Reset test is the version you should turn in. To be clear, Counter.java must compile but it should fail a reasonable Reset test.  We will run your tests against an error-free version of Counter.java to ensure that all tests pass. Then we will run your tests against your turned in version of Counter.java to see the failed Reset test.   
***Important***: You may not leave the Reset method blank, you will not recieve credit for the problem if you do.

## Problem #2 (88 points)
In this problem you will create a computer game to play the game of Rock-Paper-Scissors with a user.  If you are unfamiliar with this game, you can read about it on [Wikipedia here](http://en.wikipedia.org/wiki/Rock-paper-scissors).  

We have provided starter code for this problem.  Copy the following from the the public GitHub repository:  
RockPaperScissors.java  
RockPaperScissorsTest.java  
(Note: this problem also uses Counter.java)
    
When the user starts your game, it should play the game of Rock Paper Scissors with the user until the user types ‘q’.  Here is an example run.  User input is after the "(r=rock, p=paper, s=scissors or q to quit)".
    
```
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
r
I chose rock. It's a tie.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
p
I chose rock. You win.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
g
That is not a valid move. Please try again.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
p
I chose paper. It's a tie.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I chose rock. I win!
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
r
I chose paper. I win!
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I chose rock. I win!
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
q
Thanks for playing!
Our most recent games were: 
Me: r, You: s
Me: p, You: r
Me: r, You: s
Me: p, You: p
Me: r, You: p
Me: r, You: r
Our overall stats are:
I won: 50.00%
You won: 16.67%
We tied: 33.33%
```
Additional output examples can be viewed at the end of the writeup under "**Example Output for Problem 2**".


Do not change the starter code. However, you may add additional helper methods.
Your task is to implement the following methods:

| Method Name | Description |
|-------------|-------------|
| `public RockPaperScissors()`| constructor for the class, initializes the member | T
| `static String genCPUMove()` | generates a random String ("r", "s", or "p")|
| `public void expandCapacity()`   | doubles the size of the systemMoves array and copies over the contents of the old one|
| `public void addSystemMove(String sysMove)` | adds sysMove to the end of the systemMoves array |
| `void play(String playerMove, String sysMove)` | determines game outcome and increments variables accordingly|

We have given you the `main()` method as well as `end()`. Do not modify `end()`. You are, however, welcome to change main() while testing. Make sure before you submit that your code runs with the original `main()` method given.  
* `main()` : while playing is true, get the user's move and the computer's move and calls the `play` method.
* `end()`  : displays the game results

**Tip**: look at the `end()` method to see what variables you will need to keep track of and increment during the game. 

Here are some detailed requirements of the game play and specifics about the program:
* You may not use additional Java packages from what is given. Please do not include your own import statements. You should be able to do the assignment with what is given.
* You will write your code for the methods described above.  Please **do not** alter the provided variable names in the starter code, we will test your code using these variable. Additonally, do not delete variables or change the number of arguments in the methods. Doing so will result in incorrect auto-graded results. 
* In the starter code, we have proivded the necessary Strings for when you need to print. Use these for consistency for when we test your output. 
* The game should track the full move history for both players.  It should store the move history of the system in an array of Strings (`systemMoves`) and the move history of the user in a ArrayList of Strings (`userMoves`).  These variables are already set up in the starter code.  You just need to use them.
* The array that stores the system’s moves should be initialized to a capacity of 5 in the constructor. In your `addSystemMove` method you will need to check when the capacity is reached before you add the computer's move to the array. As the system enters more moves than the array can hold, use `expandCapacity()` to make a new array and copy over the contents of the old one.  The new array should always be twice the size of the old array.  E.g. on the 6th move, the array becomes size 10, on the 11th move it becomes size 20, etc.  You must do this resizing and copying “from scratch”.  That is, you have to write the code yourself, and **may NOT use any method in Java’s Arrays class. You will only receive half credit if you do.** 
* You should add to the end, or the "first empty index" in the system's moves array. For example when adding "s":
    * [null, null, null, null, null] -> ["s", null, null, null, null]
    * ["r", "p", null, null, null] -> ["r", "p", "s", null, null]
* Your program should gracefully handle incorrect input by re-prompting the user until they enter valid input.  You should look for the letters r, s and p exactly.
* The game should repeat until the user enters "q"
* At the end of the game, the system should print out up to the last 10 games, in reverse order.  If there has not been 10 games, it should print out as many as has been played. It should also print the win and tie statistics as in the example. Use the provided `end()` method to achieve this. 

* In `genCPUMove()`, it’s up to you on how the computer player chooses its moves, but there are two rules 1) the moves can not be the same every time, 2) it cannot cheat.  That is, it cannot look at the user’s move and then decide how to move.  It can, however, look at the user’s move history as well as its own history.  You can do something as simple as having it choose a random move every time.  But if you’d like to get more sophisticated, you should try to make the best player out there by taking into account what you know about how the user plays. It’s amazing how “smart” you can make your program with just a little information.  **If you do get creative here, make sure you document your approach in your header comment at the top of your RockPaperScissors.java file.**
* Your program should generate no exceptions under (almost) any circumstances. Try to break it with bad input.


* Look at Problem 1 as a reference on how to run RockPaperScissorsTest.java with JUnit.

## Class Surveys (2  points) 
Please fill out the following **two** surveys. Each survey will be 1 point towards your PA1 grade.  
Pre-Survey: [Pre-Survey CSE 12 Spring 2020](https://forms.gle/EJivLvBDdERVnkz79)  
Weekly Reflection Survey: [Weekly Reflection 1 Spring 2020 CSE 12](https://forms.gle/xNLuZSXw739GwSMZ7)  

Your input for the pre-survey allows us to understand who is in our course in order to provide you with the best learning opportunity possible. The weekly reflection survey will be given at the end of every assignment. This allows us to see where everyone is at and adjust accordingly. 

## Testing
For this assigment, we will provide descriptions of the Gradescope autograder tests and allow you to see your score when you submit. Note, this will not apply to future assignments! For future assignments, you will need to write your own tests to make sure that you have covered all of the edge cases and potential problems. We will only release a subset of our tests for you to use and the rest will be used to determine your grade.   
However, for this first assignment we will provide all of the tests to give you an idea of what we expect and examples of what kind of tests you should write. Here is a list of the tests for PA1: 

| Test Name | Description |
|-------------|-------------|
| TestCounterJunit |Run all the cases in the student's tester file and see which ones pass or fail  | T
| TestGenCPUMove: General Case #1| Check if output is either r, p or s|
| TestGenCPUMove: General Case #2| Check if cpu only repeats the same move|
| TestPlay: Check all #1|Check all variables after playing one game |
| TestPlay: Check all #2|Check all variables after playing 5 games |
| TestPlay: Check all #3| Check all variables after playing 15 games|
| TestPlay: totalGames() #1| Check if total number of games is recorded correctly|
| TestPlay: totalGames() #2| Check if total number of games is recorded correctly|
| TestPlay: totalGames() #3| Check if total number of games is recorded correctly with invalid move|
| TestPlay: playerWin #1| Check if number of games player won is recorded correctly|
| TestPlay: playerWin #2|Check if number of games player won is recorded correctly with invalid move |
| TestPlay: cpuWin #1|Check if number of games system won is recorded correctly |
| TestPlay: cpuWin #2| Check if number of games system won is recorded correctly with invalid move|
| TestPlay: tie #1|Check if number of games tied is recorded correctly |
| TestPlay: tie #2| Check if number of games tied is recorded correctly with invalid move|
| TestPlay: array / list #1| Check if the user / system inputs are stored correctly|
| TestPlay: array / list #2|Check if the user / system inputs are stored correctly after more than 10 games |
| TestPlay: quit #1|Check if the game quits correctly after some moves |
| TestPlay: quit #2| Check if the game quits correctly after no moves|
| TestPlay: system output #2|Check if correct messages were printed while playing game |
| TestConstructor: Constructor Playing| Test if playing is true|
| TestConstructor: Constructor size| The initial size should be 0|
| TestConstructor: Constructor initialCapacity| The initialCapacity should be 5|
| TestConstructor: System Moves Size| The initial length of the array should be 5|
| TestConstructor: userMoves not null| Check that the userMoves ArrayList is not null|
| TestConstructor: totalGames not null| Check that the totalGames Counter is not null|
| TestConstructor: playerWin not null| Check that the playerWin Counter is not null|
| TestConstructor: cpuWin not null| Check that the cpuWin Counter is not null|
| TestConstructor: tie not null|Check that the tie Counter is not null |
| TestExpandCapacity: Expanded size | The size of the expanded array should double|
| TestExpandCapacity: Expanded content | The content of the expanded array should contain the old content|
| TestAddSystemMove: Add one move | Adding one move to an empty RockPaperScissors (RPS)|
| TestAddSystemMove: Add multiple moves, no expand | Adding 5 moves to an empty RPS, expandCapacity should not be called|
| TestAddSystemMove: Add multiple moves, expand |Adding 6 moves to an empty RPS, expandCapacity should be called |
| TestAddSystemMove: Add multiple moves, many expands | Adding 39 moves to an empty RPS, expandCapacity should be called 3 times|


## Submission
[//]: # (TODO: Add submission instructions for Gradescope)
Submit the following files to Gradescope under the assignment "Programming Assignment 1":
- Counter.java
- CounterTest.java
- RockPaperScissors.java

If you are working on the PA via ieng6 remotely you can utilize WinSCP or Mac SCP to retrieve your files for submission (or just the [scp command](https://linuxize.com/post/how-to-use-scp-command-to-securely-transfer-files/) if you are familiar with it).



## Example Output for Problem 2
Enter 'q' immediately:
```
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
q
Thanks for playing!
Our most recent games were: 
Our overall stats are:
I won: NaN%
You won: NaN%
We tied: NaN%
```
More than 10 games (with invalid input):
```
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
r
I chose scissors. You win.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I chose rock. I win!
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
p
I chose rock. You win.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I chose rock. I win!
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
r
I chose scissors. You win.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
rr
That is not a valid move. Please try again.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
t
That is not a valid move. Please try again.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
k
That is not a valid move. Please try again.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I chose rock. I win!
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
i
That is not a valid move. Please try again.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
p
I chose rock. You win.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
r
I chose scissors. You win.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I chose paper. You win.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
p
I chose scissors. I win!
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
s
I chose paper. You win.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
p
I chose paper. It's a tie.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
r
I chose rock. It's a tie.
Let's play! What's your move? (r=rock, p=paper, s=scissors or q to quit)
q
Thanks for playing!
Our most recent games were: 
Me: r, You: r
Me: p, You: p
Me: p, You: s
Me: s, You: p
Me: p, You: s
Me: s, You: r
Me: r, You: p
Me: r, You: s
Me: s, You: r
Me: r, You: s
Our overall stats are:
I won: 30.77%
You won: 53.85%
We tied: 15.38%
```
