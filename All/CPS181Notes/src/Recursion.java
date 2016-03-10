	import java.util.Scanner;
public class Recursion {

	public static void main(String[] args) {
		//Having an area and trying to define that area
		//
		//Base Case
		
		//LinkedList to pull stuff in and out. Not as efficient as arrayList
		for( int count = 9; count == 0; count++){}
		//cutting things in half. There's a Cracked article on it.
		 
		
		//
		//The Following is a binary search
		//
		
		
		
		
	}
	

 
	static class BinarySearch 
	{
	  public static void main(String args[])
	  {
	    int c, first, last, middle, n, search, array[];
	 
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    n = in.nextInt(); 
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	 
	    for (c = 0; c < n; c++)
	      array[c] = in.nextInt();
	 
	    System.out.println("Enter value to find");
	    search = in.nextInt();
	 
	    first  = 0;
	    last   = n - 1;
	    middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if ( array[middle] < search )
	        first = middle + 1;    
	      else if ( array[middle] == search ) 
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(search + " is not present in the list.\n");
	  }
	}
	
}
