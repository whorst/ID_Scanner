
public class sousa extends brass {

	public sousa(){
		this.name= "sousa";
		this.numOfButtons= 3;
	}
	
	public void play(){
		System.out.println("All sousa players are annoying");
	}
	public static void main(String [] args){
		sousa sous = new sousa();
		sous.play();
		System.out.println(sous.getNumOfButtons());
		System.out.println(sous.getName());
	}
}
