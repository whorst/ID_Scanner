public class Lockers {
	public static void main(String[] args) {

		final int lockerNumber = 100;

		boolean lockerList[] = new boolean[lockerNumber];

		for (int j = 1; j <= 100; j++) { 
			
			//j is the student number.
			//starting from lockers j-1
			
			for (int i = j - 1; i < lockerNumber; i += j) {
				lockerList[i] = !lockerList[i];
			}

		}
			for (int i = 0; i <  lockerNumber; i++){
				if (lockerList[i] ==true){
					System.out.println("Locker" + (i + 1) + " is open" );
				}
			}
	}
}
//arrays start as zeros