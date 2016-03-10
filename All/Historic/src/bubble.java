

class ArrayDemo {
	public static void main(String[] args) {
		// declares an array of integers
		int[] anArray;

		// allocates memory for 10 integers
		anArray = new int[4];

		// initialize first element
		anArray[0] = 3;
		// initialize second element
		anArray[1] = 2;
		// and so forth
		anArray[2] = 6;
		anArray[3] = 1;

		for (int i = 0; i < anArray.length - 1; i++) {
			//i is the base variable. -1 ensures you don't step out of array.
			//next number as the base
			for (int j = i + 1; j < anArray.length; j++) {
				//array.length is one more than the maximum value of the array.
				if (anArray[i] < anArray[j]) {
					int	temp = anArray[j];
					anArray[j]= anArray[i];
					anArray[i]= temp;
				}
			}
		}
	for (int i = 0; i < anArray.length; i++) {
		//print out all values of the array
		System.out.println(anArray[i]);
	}
		

	}
}
