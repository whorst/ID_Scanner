import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Room {

	static java.util.LinkedList<Integer> queue1 = new java.util.LinkedList<Integer>();
	static java.util.LinkedList<Integer> queue2 = new java.util.LinkedList<Integer>();
	static java.util.LinkedList<Integer> queue3 = new java.util.LinkedList<Integer>();
	static java.util.LinkedList<Integer> queue0 = new java.util.LinkedList<Integer>();

	public static java.util.LinkedList<Integer> queue = new java.util.LinkedList<Integer>();
	public static Lock lock = new ReentrantLock();
	public static Condition moreCookies = lock.newCondition();
	public static Semaphore semaphore = new Semaphore(2);

	int children;
	int room;

	int capacity;
	int plate;

	static String Name;

	Random rn = new Random();

	public synchronized int putCookies() {

		lock.lock();
		try {
			int firstNum = queue.size();
			while (queue.size() < 10) {
				queue.offer(1);
				System.out.println("the mom is making some");
				moreCookies.signalAll();
			}
			int secondNum = queue.size();
			int act = secondNum - firstNum;

		} finally {
			lock.unlock();
		}
		return capacity;
	}

	public synchronized int eatCookies() throws InterruptedException {
		
		System.out.println(queue0.size());
		System.out.println(queue1.size());
		System.out.println(queue2.size());
		System.out.println(queue3.size());
		
		String name = Thread.currentThread().getName();

		if (name.equals("Thread-0"))
			Name = "Adam";
		if (name.equals("Thread-1"))
			Name = "Bob";
		if (name.equals("Thread-2"))
			Name = "Caroline";
		if (name.equals("Thread-3"))
			Name = "Darcy";
		
		
		if (queue0.size() >= 20)
			if(Thread.currentThread().getName().equals("Thread-0")){
				Thread.currentThread().stop();
				//Thread.currentThread().kill();

			}
		if (queue1.size() >= 20)
			if(Thread.currentThread().getName().equals("Thread-1")){
				Thread.currentThread().stop();
			}
		if (queue2.size() >= 20)
			if(Thread.currentThread().getName().equals("Thread-2")){
				Thread.currentThread().stop();
			}		
		if (queue3.size() >= 20)
			if(Thread.currentThread().getName().equals("Thread-3")){
				Thread.currentThread().stop();
			}		
		semaphore.acquire();
		lock.lock();
		try {

			int firstNum = queue.size();
			int rand = rn.nextInt(10 - 1 + 1) + 1;

			while (rand > queue.size()) {
				moreCookies.await();
			}
			System.out.println(Name + " is eating " + rand + " cookies");
			for (int i = 0; i < rand; i++) {
				queue.remove();

				if (Name.equals("Adam"))
					addQ0();
				// System.out.println(queue0.size());
				if (Name.equals("Bob"))
					// queue1.offer(1);
					addQ1();

				// System.out.println(queue1.size());
				if (Name.equals("Caroline"))
					addQ2();

				// System.out.println(queue2.size());
				if (Name.equals("Darcy"))
					// queue3.offer(1);
					addQ3();

				// System.out.println(queue3.size());

				Thread.sleep(1000);

			}
			return rand;
		} finally {
			semaphore.release();

			lock.unlock();
		}
	}

	public void addQ0() {
		queue0.add(1);
		//System.out.println(queue0.size());
	}
	public void addQ1() {
		queue1.add(1);
		//System.out.println(queue1.size());

	}
	public void addQ2() {
		queue2.add(1);
	//	System.out.println(queue2.size());

	}
	public void addQ3() {
		queue3.add(1);
		//System.out.println(queue3.size());

	}



}
