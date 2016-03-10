
public class Constructor {

	public static void main(String[] args) {
		class Dog extends Animal {
		    String name;
		    String breed;
		  
		    // first constructor
		    public Dog(String s) {
		        name = s;
		        breed = "unknown";
		    }
		 
		    // second constructor
		    public Dog(String name, String breed) {
		        this.name = name;
		        this.breed = breed;
		    }
		}
	}

}
