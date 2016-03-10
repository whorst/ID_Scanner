package mmmmm;

import java.util.Scanner;

public class hhhhhh {

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

		// This counts the turn the player is on.
		String turnofPlayer; // This goes through the respective player's turns.

		System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
		System.out.printf("\n_____|_____|_____");
		System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
		System.out.printf("\n_____|_____|_____");
		System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);
		System.out.println("          ");

		// The number of turns one is able to take is
		// 9

		// System.out.println("Make a choice! a1-c3, then X or O"); // prompts
		// // the
		// // player
		// // to
		// // make
		// // a choice
		// turnofPlayer = input.next(); // tornofPlayer keeps track of the
		// player's turn
		boolean valid = false;
		boolean turnA = false;
		boolean isComputerMoveValid = false;

		int fieldCounter = 0;

		while (fieldCounter < 9) {
			System.out.println("Make a choice! a1-c3, then X or O");
			turnofPlayer = input.next();
			// while(fieldCounter <= 9) {

			if (turnofPlayer.equals("a1")) {
				if (a1 == " ") {
					a1 = "X";
					fieldCounter++;
				} else {
					// Creates an if/else statement that allows the user to
					// choose which point they'd like to start in.
					if (!a1.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);

				}

			}
			if (turnofPlayer.equals("a2")) {
				if (a2 == " ") {
					a2 = "X";
					fieldCounter++;
				} else {
					if (!a2.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);
				}

			}
			if (turnofPlayer.equals("a3")) {
				if (a3 == " ") {
					a3 = "X";
					fieldCounter++;
				} else {
					if (!a3.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);
				}

			}
			if (turnofPlayer.equals("b1")) {
				if (b1 == " ") {
					b1 = "X";
					fieldCounter++;
				} else {
					if (!b1.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);

				}

			}
			if (turnofPlayer.equals("b2")) {
				if (b2 == " ") {
					b2 = "X";
					fieldCounter++;
				} else {
					if (!b2.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);

				}

			}
			if (turnofPlayer.equals("b3")) {
				if (b3 == " ") {
					b3 = "X";
					fieldCounter++;
				} else {
					if (!b3.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);

				}

			}
			if (turnofPlayer.equals("c1")) {
				if (c1 == " ") {
					c1 = "X";
					fieldCounter++;
				} else {
					if (!c1.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);

				}

			}
			if (turnofPlayer.equals("c2")) {
				if (c2 == " ") {
					c2 = "X";
					fieldCounter++;
				} else {
					if (!c2.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);

				}

			}
			if (turnofPlayer.equals("c3")) {
				if (c3 == " ") {
					c3 = "X";
					fieldCounter++;
				} else {
					if (!c3.equals(" "))
						;
					System.out
							.println("Block already is use, dont fool around. Game over!");
					System.exit(0);

				}

			}
			// print the game board

			System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
			System.out.printf("\n_____|_____|_____");
			System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
			System.out.printf("\n_____|_____|_____");
			System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);
			System.out.println("          ");
			System.out.println("          ");

			if (a1 == "X" && a2 == "X" && a3 == "X") {
				System.out.println("Winner!");
				System.exit(0);
			}

			if (b1 == "X" && b2 == "X" && b3 == "X") {
				System.out.println("Winner!");
				System.exit(0);
			}
			if (c1 == "X" && c2 == "X" && c3 == "X") {
				System.out.println("Winner!");
				System.exit(0);
			}

			if (a1 == "X" && b1 == "X" && c1 == "X") {
				System.out.println("Winner!");
				System.exit(0);
			}

			if (a2 == "X" && b2 == "X" && c2 == "X") {
				System.out.println("Winner!");
				System.exit(0);
			}
			if (a3 == "X" && b3 == "X" && c3 == "X") {
				System.out.println("Winner!");
				System.exit(0);
			}
			if (a1 == "X" && b2 == "X" && c3 == "X") {
				System.out.println("Winner!");
				System.exit(0);
			}
			if (c1 == "X" && b2 == "X" && a3 == "X") {
				System.out.println("Winner!");
				System.exit(0);
			}

			System.out.println("It's the CPU's turn");
			isComputerMoveValid = false;

			while (!isComputerMoveValid) {
				int rand = (int) (0 + Math.random() * 9);

				switch (rand) {

				case 0:

					if (a1.equals(" ")) {
						a1 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!a1.equals(" "))
							;

					}
					break;
				case 1:
					if (a2.equals(" ")) {
						a2 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!a2.equals(" "))
							;

					}
					break;
				case 2:
					if (a3.equals(" ")) {
						a3 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!a3.equals(" "))
							;

					}
					break;
				case 3:
					if (b1.equals(" ")) {
						b1 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!b1.equals(" "))
							;

					}
					break;
				case 4:
					if (b2.equals(" ")) {
						b2 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!b2.equals(" "))
							;

					}
					break;
				case 5:
					if (b3.equals(" ")) {
						b3 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!b3.equals(" "))
							;

					}
					break;
				case 6:
					if (c1.equals(" ")) {
						c1 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!c1.equals(" "))
							;

					}
					break;
				case 7:
					if (c2.equals(" ")) {
						c2 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!c2.equals(" "))
							;

					}
					break;
				case 8:
					if (c3.equals(" ")) {
						c3 = "O";
						fieldCounter++;
						isComputerMoveValid = true;
					} else {
						if (!c3.equals(" "))
							;

					}

					break;

				}

			}

			System.out.printf("%4s|%4s|%4s|", a1, a2, a3);
			System.out.printf("\n_____|_____|_____");
			System.out.printf("\n%4s|%4s|%4s|", b1, b2, b3);
			System.out.printf("\n_____|_____|_____");
			System.out.printf("\n%4s|%4s|%4s|", c1, c2, c3);
			System.out.println("          ");
			System.out.println("          ");

			if (a1 == "0" && a2 == "O" && a3 == "O") {
				System.out.println("CPU Winner!");
				System.exit(0);
			}

			if (b1 == "O" && b2 == "O" && b3 == "O") {
				System.out.println("CPU Winner!");
				System.exit(0);
			}
			if (c1 == "O" && c2 == "O" && c3 == "O") {
				System.out.println("CPU Winner!");
				System.exit(0);
			}

			if (a1 == "O" && b1 == "O" && c1 == "O") {
				System.out.println("CPU Winner!");
				System.exit(0);
			}

			if (a2 == "O" && b2 == "O" && c2 == "O") {
				System.out.println("CPU Winner!");
				System.exit(0);
			}
			if (a3 == "O" && b3 == "O" && c3 == "O") {
				System.out.println("CPU Winner!");
				System.exit(0);
			}
			if (a1 == "O" && b2 == "O" && c3 == "O") {
				System.out.println("CPU Winner!");
				System.exit(0);
			}
			if (c1 == "O" && b2 == "O" && a3 == "O") {
				System.out.println("CPU Winner!");
				System.exit(0);
			}

		}

	}

}