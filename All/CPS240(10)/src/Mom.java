public class Mom implements Runnable {

	Room rm = new Room();
	static int f;

	@Override
	public void run() {

		int i = 0;
		while (true) {
			rm.putCookies();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
