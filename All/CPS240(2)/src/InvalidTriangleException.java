
//stopWatch.java
//Will Horst
//HW2c
//9/16/2015
//This program creates an exception


public class InvalidTriangleException extends Exception { //Extends InvalidTriangleException from the exception class


		public InvalidTriangleException(){ //Create our own exception along with calling our super constructor
			super();
	}
		public String toString(){ 
			return  super.toString()+"The sum of any two sides should be less than or equal to the other side" ;	
			//This will be displayed 
		}

}
