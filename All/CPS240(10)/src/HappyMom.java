public class HappyMom {

	static Room room = new Room();

	static Thread Adam = new Thread(new Child());
	static Thread Bob = new Thread(new Child());
	static Thread Caroline = new Thread(new Child());
	static Thread Darcy = new Thread(new Child());
	static Thread Mom = new Thread(new Mom());

	public static void main(String[] args) {
		Mom.start();

		Adam.start();
		Bob.start();
		Caroline.start();
		Darcy.start();

	}
}
