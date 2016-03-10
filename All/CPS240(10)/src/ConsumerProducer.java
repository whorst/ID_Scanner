
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class ConsumerProducer
{
	private static Buffer buffer = new Buffer();

	public static void main(String[] args)
	{
		// Create a thread pool with two threads
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new ProducerTask());
		executor.execute(new ConsumerTask());
		executor.shutdown();
	}

	// A task for adding an int to the buffer
	private static class ProducerTask implements Runnable
	{
		public void run()
		{
			try
			{
				int i = 0;
				while (true)
				{
					i++;
					System.out.println("Producer tries to write " + i+" ...");
					buffer.write(i); // Add a value to the buffer
					System.out.println("Producer writing: "+i+" is sucessful.");
					
					// Put the thread into sleep
					Thread.sleep((int) (Math.random() * 1000));
				}
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}

	// A task for reading and deleting an int from the buffer
	private static class ConsumerTask implements Runnable
	{
		public void run()
		{
			try
			{
				while (true)
				{
					System.out.println("\t\t\tConsumer tries to read ... ");
					System.out.println("\t\t\tConsumer reading: "+buffer.read()+" is successful.");
					
					// Put the thread into sleep
					Thread.sleep((int) (Math.random() * 1000));
				}
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}

	// An inner class for buffer
	private static class Buffer
	{
		private static final int CAPACITY = 1; // buffer size
		private java.util.LinkedList<Integer> queue = new java.util.LinkedList<Integer>();

		// Create a new lock
		private static Lock lock = new ReentrantLock();

		// Create two conditions (one for each thread)
		private static Condition consumerCond = lock.newCondition();
		private static Condition producerCond = lock.newCondition();

		public void write(int value)
		{
			lock.lock(); // Acquire the lock
			try
			{
				while (queue.size() == CAPACITY)
				{
					System.out.println("Wait ... ");
					producerCond.await();
				}

				queue.offer(value);
				consumerCond.signal(); // Signal consumerCond condition
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				lock.unlock(); // Release the lock
			}
		}

		public int read()
		{
			int value = 0;
			lock.lock(); // Acquire the lock
			try
			{
				while (queue.isEmpty())
				{
					System.out.println("\t\t\tWait ... ");
					consumerCond.await();
				}

				value = queue.remove();
				producerCond.signal(); // Signal producerCond condition
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				lock.unlock(); // Release the lock
				return value;
			}
		}
	}
}
