package System.out;


import java.util.Scanner;

public class tictactoe4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char a1 = ' ';
		char a2 = ' ';
		char a3 = ' ';        //Lines 8-16 declare every single gameboard variable with an empty value.
		char b1 = ' ';
		char b2 = ' ';
		char b3 = ' ';
		char c1 = ' ';
		char c2 = ' ';
		char c3 = ' ';

		int watcher = 0; //This counts the turn the player is on.
		String turnofPlayer; //This goes through the respective player's turns.

		System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
		System.out.printf("\n____|____|____");
		System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);   ////Lines 21-25 initially print the gameboard
		System.out.printf("\n____|____|____");
		System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

		while (watcher < 9) {									//The number of turns one is able to take is 9

			System.out.println("Make a choice!");				//prompts the player to make a choice
			turnofPlayer = input.next();						//tornofPlayer keeps track of the player's turn
			boolean valid = false;								
			boolean turnA = false;

			while (!valid) {
				if (turnofPlayer.equals("a1")) {				//Creates an if/else statement that allows the user to choose which point they'd like to start in.
					if (a1 != ' ') {
						System.out.println("Block already is use, try again!");			//Prints out the code in the case that block is already taken
					} else {
						if (!turnA) {
							System.out.println("What is turn a1?");
							a1 = 'X';
						
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);   //These lines of code display and update the gameboard.
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;                                        //Adds one to the watcher variable until said variable equals 9
				}
				if (turnofPlayer.equals("a2")) {
					if (a2 != ' ') {
						System.out.println("Block already is use, try again!");
					} else {
						if (turnA != true) {
							a2 = 'X';
						
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;                                    
				}

				if (turnofPlayer.equals("a3")) {
					if (a3 != ' ') {
						System.out.println("Block already is use, try again!");
					} else {
						if (!turnA) {
							a3 = 'X';
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;
				}

				if (turnofPlayer.equals("b1")) {
					if (b1 != ' ') {
						System.out.println("Block already is use, try again!");
					} else {
						if (!turnA) {
							b1 = 'X';
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;
				}
				if (turnofPlayer.equals("b2")) {
					if (b2 != ' ') {
						System.out.println("Block already is use, try again!");
					} else {
						if (turnA != true) {
							b2 = 'X';
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;
				}

				if (turnofPlayer.equals("b3")) {
					if (b3 != ' ') {
						System.out.println("Block already is use, try again!");
					} else {
						if (!turnA) {
							b3 = 'X';
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;
				}
				if (turnofPlayer.equals("c1")) {
					if (c1 != ' ') {
						System.out.println("Block already is use, try again!");
					} else {
						if (!turnA) {
							c1 = 'X';
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;
				}
				if (turnofPlayer.equals("c2")) {
					if (c2 != ' ') {
						System.out.println("Block already is use, try again!");
					} else {
						if (turnA != true) {
							c2 = 'X';
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;
				}

				if (turnofPlayer.equals("c3")) {
					if (c3 != ' ') {
						System.out.println("Block already is use, try again!");
					} else {
						if (!turnA) {
							c3 = 'X';
						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;
				
				}
			}
		}
	}
}