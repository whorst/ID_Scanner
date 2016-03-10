
public abstract class Automobile {

	public abstract double getMPG();
	
	public String make;
	public String toString() {
		return "Automobile " + make;
	}
	
	public Automobile( String make){
		this.make=make;
	}
	}

interface computer {
	public static void getVersion(){
	}
	
}


class truck extends Automobile implements computer, Comparable <truck> {

	public truck(String make) {
		super(make);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getMPG() {
		System.out.println("The MPG of a truck is 11");
		
	}

	@Override
	public int compareTo(truck arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

