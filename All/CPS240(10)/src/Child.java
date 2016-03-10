public class Child implements Runnable {

	Room rm = new Room();

	@Override
	public void run() {
		while (true) {

			try {
				rm.eatCookies();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}