//William Horst
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Historic {

    public static void main(String[] args) throws FileNotFoundException { //Create the main method

        File event = new File("events.txt");  //Import events.txt

        Scanner in = new Scanner(event); //Create your scanner object

        PrintWriter output = new PrintWriter("events1.txt"); //Create your printwriter object

        int[] Array1 = new int[89]; //Declare your first array
        int[] Array2 = { 1892 }; //Declare your second array

        int count = input(in, Array1);

        int size = Array1.length + Array2.length;

        int[] Array3 = new int[size]; // Array 3 is equal to the size of array1 and array2

        sort(Array2, count);
        for (int i = 0; i < count; i++) {
            // print out all values of the array
            System.out.println(Array2[i]);
        }
        sort(Array1, count);
        for (int i = 0; i < 1; i++) {
            if (!Array1.equals(1892)) {
                System.out.println("The founding of CMU was not an important event apparently!"); //This method searches for 1892 in the array
            }
        }
        System.arraycopy(Array1, 0, Array3, 0, Array1.length);
        System.arraycopy(Array2, 0, Array3, Array1.length, Array2.length); //Copies array1 and array2 to create array3

        sort2(Array3, size);
        for (int i = 0; i < size; i++) {
            // print out all values of the array
            System.out.println(Array3[i]);
        }
         write(Array3,  output, size);
    }
   
   
     public static int input(Scanner in, int[] Array1) {
        int count = 0;
        while (in.hasNext()) {
            Array1[count++] = in.nextInt();
        }
        return count;
    }

    public static int[] sort(int[] anArray, int count) {
        for (int i = 0; i < count - 1; i++) {
            // i is the base variable. -1 ensures you don't step out of array.
            // next number as the base
            for (int j = i + 1; j < count; j++) {
                // array.length is one more than the maximum value of the array.
                if (anArray[i] < anArray[j]) {
                    int temp = anArray[j];
                    anArray[j] = anArray[i];
                    anArray[i] = temp;

                }
            }
        }
        return anArray;
    }

    public static int[] sort2(int[] anArray1, int count) {
        for (int i = 0; i < count - 1; i++) {
            // i is the base variable. -1 ensures you don't step out of array.
            // next number as the base
            for (int j = i + 1; j < count; j++) {
                // array.length is one more than the maximum value of the array.
                if (anArray1[i] < anArray1[j]) {
                    int temp = anArray1[j];
                    anArray1[j] = anArray1[i];
                    anArray1[i] = temp;

                }
            }
        }
        return anArray1;

    }

    public static void write(int[] Array3, PrintWriter output, int size) {
        for (int i = 0; i < size; i++) {
            // print out all values of array 3 to events1.txt
            output.println(Array3[i]);
        }
output.close();
    }
}

// array copy, temp, printwriter