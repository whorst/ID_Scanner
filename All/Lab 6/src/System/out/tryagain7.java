package System.out;

import java.util.Scanner;

public class tryagain7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String a1 = " ";
		String a2 = " ";
		String a3 = " ";
		String b1 = " ";
		String b2 = " ";
		String b3 = " ";
		String c1 = " ";
		String c2 = " ";
		String c3 = " ";

		int watcher = 0; // This counts the turn the player is on.
		String turnofPlayer; // This goes through the respective player's turns.

		System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
		System.out.printf("\n____|____|____");
		System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3); // //Lines 21-25
															// initially print
															// the gameboard
		System.out.printf("\n____|____|____");
		System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

		while (watcher == 0 || watcher == 2 || watcher == 4 || watcher == 6 || watcher == 8) { // The number of turns one is able to take is
									// 9

			System.out.println("Make a choice! a1-c3, then X or O"); // prompts
																		// the
																		// player
																		// to
																		// make
			// a choice
			turnofPlayer = input.next(); // tornofPlayer keeps track of the
											// player's turn
			boolean valid = false;
			boolean turnA = false;

			while (!valid) {

				if (turnofPlayer.equals("a1")) {
					if (a1 == " ") {
						System.out.println("What is turn a1?");
						a1 = input.next(); // Prints out the code in the case
											// that block is already taken
					} else {
						// Creates an if/else statement that allows the user to
						// choose which point they'd like to start in.
						if (a1 != " ") {
							System.out
									.println("Block already is use, try again!");

						}
					}
					System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3); // These
																		// lines
																		// of
																		// code
																		// display
																		// and
																		// update
																		// the
																		// gameboard.
					System.out.printf("\n_____|_____|_____");
					System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

					valid = true;

					watcher++;
				}
				if (turnofPlayer.equals("a2")) {
					if (a2 == " ") {
						System.out.println("What is turn a2?");
						a2 = input.next();
					} else {

						if (a2 != " ") {
							System.out
									.println("Block already is use, try again!");
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
					if (a3 == " ") {
						System.out.println("What is turn a3?");
						a3 = input.next();

					} else {
						// Creates an if/else statement that allows the user to
						// choose which point they'd like to start in.
						if (a3 != " ") {
							System.out
									.println("Block already is use, try again!");
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
					if (b1 == " ") {
						System.out.println("What is turn b1?");
						b1 = input.next();
					} else {

						if (b1 != " ") {
							System.out
									.println("Block already is use, try again!");
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
					if (b2 == " ") {
						System.out.println("What is turn b2?");
						b2 = input.next();
					} else {

						if (b2 != " ") {
							System.out
									.println("Block already is use, try again!");
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
					if (b3 == " ") {
						System.out.println("What is turn b3?");
						b3 = input.next();

					} else {

						if (b3 != " ") {
							System.out
									.println("Block already is use, try again!");
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
					if (c1 == " ") {
						System.out.println("What is turn c1?");
						c1 = input.next();
					} else {

						if (c1 != " ") {
							System.out
									.println("Block already is use, try again!");
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
					if (c2 == " ") {
						System.out.println("What is turn c2?");
						c2 = input.next();
					} else {

						if (c2 != " ") {
							System.out
									.println("Block already is use, try again!");
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
					if (c3 == " ") {
						System.out.println("What is turn c3?");
						c3 = input.next();

					} else {

						if (c3 != " ") {
							System.out
									.println("Block already is use, try again!");
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
		while (watcher == 1 || watcher == 3){

			System.out.println("It's the CPU's turn");

			double turnofCPU = (double) 1 + Math.random() * 9;
			
			if (turnofCPU == 1) {
				if (a2 == " ") {
					a2 = "O";
				}else{
					if (a2 != " ") {
						System.out.println("Try again");
						watcher++;
					}
				}
			}
			System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
			System.out.printf("\n_____|_____|_____");
			System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
			System.out.printf("\n_____|_____|_____");
			System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);

			watcher++;
		} 

	}

}
