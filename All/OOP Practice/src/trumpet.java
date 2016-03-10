
public class trumpet extends brass {
	
	
	 
	public trumpet(){
		this.name = "trumpet";
		this.numOfButtons = 3;
	}

	void play(){
		System.out.println("This is annoying");
	}

	public static void main(String [] args){
		trumpet trum = new trumpet();
		trum.play();
		System.out.println(trum.getNumOfButtons());
		System.out.println(trum.getName());
	}
	
}
