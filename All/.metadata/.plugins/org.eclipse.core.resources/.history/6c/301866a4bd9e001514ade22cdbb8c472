import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class HappyMom
{
    static Thread mom =new Thread(new mom());
    static Thread Billy =new Thread(new child());
    static Thread Bob =new Thread(new child());
    static Thread Joe =new Thread(new child());
    static Thread Jeff =new Thread(new child());
    
    static int Bobnum=0;
    static int Billynum=0;
    static int Joenum=0;
    static int Jeffnum=0;
    static int Momnum=0;

    
    private static room Plate = new room();

    public static void main(String[] args)
    {
    System.out.println("main () of HappyMom. Create and run threads(1 mom and 4 children)");
    mom.start();
    Billy.start();
    Bob.start();
    Joe.start();
    Jeff.start();
    
    
        
    }
public static void stats(Boolean answer){
    if(answer=true){
    	System.out.println("Mom made a total of : " + Momnum + " Cookies");
    	 System.out.println("Bob Ate: " + Bobnum + " Cookies");
    	 System.out.println("Billy Ate: " + Billynum + " Cookies");
    	 System.out.println("Joe Ate: " + Joenum + " Cookies");
    	 System.out.println("Jeff Ate: " + Jeffnum + " Cookies");
        }
}

   
    public static class mom extends HappyMom implements Runnable
    {
    	
        @SuppressWarnings("deprecation")
		public void run()
        {
        	
            try
            {
                int i = 10;
                while (true)
                {
                   
                    int nummade = Plate.putcookies(i); // Add a value to the buffer
                    Momnum+=nummade;
               
                    if(Bob.isAlive()!=true &&Jeff.isAlive()!=true && Joe.isAlive()!=true && Billy.isAlive()!=true){
                        HappyMom.stats(false);
                        mom.stop();
                    }
                    // Put the thread into sleep
                    System.out.println("Mom: tired must sleep");
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
    public static class child extends HappyMom implements Runnable
    {
    	 
        @SuppressWarnings("deprecation")
        public void run()
        {
            
            
            
            try
            {
                while (true)
                {
                	 if(Thread.currentThread().getName().equals("Thread-4")){
                     	System.out.println("Child (Jeff): Wants to enter the room ... ");
                     }
                     if(Thread.currentThread().getName().equals("Thread-3")){
                     	System.out.println("Child (Joe): Wants to enter the room ... ");
                     }
                     if(Thread.currentThread().getName().equals("Thread-2")){
                     	System.out.println("Child(Bob): Wants to enter the room ... ");
                     }
          			if(Thread.currentThread().getName().equals("Thread-1")){
          				System.out.println("Child (Billy): Wants to enter the room ... ");
          			}
                	
                    
                    if(Thread.currentThread().getName().equals("Thread-4")){
                        int Temp= Plate.eatcookies();
                        Jeffnum+=Temp;
                       
                        
                        if(Jeffnum >=20){
                            Jeff.stop();
                        }
                    }
                    if(Thread.currentThread().getName().equals("Thread-3")){
                        int Temp= Plate.eatcookies();
                        Joenum+=Temp;
                        
                        
                        if(Joenum >=20){
                            Joe.stop();
                        }
                    }
                    if(Thread.currentThread().getName().equals("Thread-2")){
                        int Temp= Plate.eatcookies();
                        Bobnum+=Temp;
                        
                        
                        if(Bobnum >=20){
                            Bob.stop();
                        }
                    }
                    if(Thread.currentThread().getName().equals("Thread-1")){
                        int Temp= Plate.eatcookies();
                        Billynum+=Temp;
                       
                        
                        if(Billynum >=20){
                            Billy.stop();
                        }
                    }
                   
                    if(Thread.currentThread().getName().equals("Thread-4")){
                     	System.out.println("Child (Jeff): Going out to play ... ");
                     }
                     if(Thread.currentThread().getName().equals("Thread-3")){
                     	System.out.println("Child (Joe): Going out to play ... ");
                     }
                     if(Thread.currentThread().getName().equals("Thread-2")){
                     	System.out.println("Child(Bob): Going out to play ... ");
                     }
          			if(Thread.currentThread().getName().equals("Thread-1")){
          				System.out.println("Child (Billy): Going out to play ... ");
          			}
                	
                    Thread.sleep((int) (Math.random() * 1000));
                }
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
    }

    
    public static class room extends HappyMom
    {
    	 protected static Lock lock = new ReentrantLock();
         protected static Semaphore sem = new Semaphore(2);
         
         protected static Condition MasterLock1 = lock.newCondition();
         protected static Condition MasterLock2 = lock.newCondition();
         protected static Condition MasterLock3 = lock.newCondition();
         protected static Condition MasterLock4 = lock.newCondition();
         protected static Condition mom = lock.newCondition();
         
         boolean wait1=false;
         boolean wait2=false;
         boolean wait3=false;
         boolean wait4=false;
         
        private static final int CAPACITY = 10; 
        private java.util.LinkedList<Integer> queue = new java.util.LinkedList<Integer>();
        int numofkids=0;

        
       

        public int putcookies(int value)
        {
            int num =0;
            int made=0;
            int add=0;
           
           lock.lock(); 
            try
            {
            	System.out.println("Mom Enters the room. " + numofkids + " Children and " + queue.size() + " Cookies are in the room");
           
                
                while(queue.size() <10){
                    num++;
                    made++;
                    queue.offer(add);
                }
                
               
                System.out.println("Mom made: "+made+" Cookies.");
                made=0;
                
                if(wait4==true){
                	
                	wait4=false;
                	MasterLock4.signal();
                 }
                if(wait3==true){
                	
                	wait3=false;
                	MasterLock3.signal();
                 }
                if(wait2==true){
                	
                	wait2=false;
                	MasterLock2.signal();
                 }
                if(wait1==true){
                	
                	wait1=false;
                	MasterLock1.signal();
                 }
                
                
            }
            
            finally
            {
            	
               lock.unlock(); 
               System.out.println("Cookies on the plate " + queue.size());
            }
            
            return num;
        }

        @SuppressWarnings("finally")
        public int eatcookies()
        {
            Random random = new Random();
            
            int value = Math.abs(random.nextInt(10 - 1 + 1) + 1);
            if(Thread.currentThread().getName().equals("Thread-4")){
            	System.out.println("Child (Jeff) Wants to eat " + value + " Cookies");
            }
            if(Thread.currentThread().getName().equals("Thread-3")){
            	System.out.println("Child (Joe) Wants to eat " + value + " Cookies");
            }
            if(Thread.currentThread().getName().equals("Thread-2")){
            	System.out.println("Child (Bob) Wants to eat " + value + " Cookies");
            }
 			if(Thread.currentThread().getName().equals("Thread-1")){
 				System.out.println("Child (Billy) Wants to eat " + value + " Cookies");
 			}
            
 			
            int actate=0;
        
        
            try
            {
                
                sem.acquire(); 
                numofkids++;
                if(Thread.currentThread().getName().equals("Thread-4")){
                	 
                	 System.out.println("Child (Jeff) Enters the room now " + numofkids + " Children and " + queue.size() + " Cookies are in the room");
                }
                if(Thread.currentThread().getName().equals("Thread-3")){
                	
                	 System.out.println("Child (Joe) Enters the room now " + numofkids + " Children and " + queue.size() + " Cookies are in the room");
                }
                if(Thread.currentThread().getName().equals("Thread-2")){
                	 System.out.println("Child (Bob) Enters the room now " + numofkids + " Children and " + queue.size() + " Cookies are in the room");
                }
     			if(Thread.currentThread().getName().equals("Thread-1")){
     			
     				System.out.println( "Child (Billy) Enters the room now " + numofkids + " Children and " + queue.size() + " Cookies are in the room");     			
     			}
                
                
                while (queue.isEmpty()||queue.size() < value)
                {
                    
                    if(Thread.currentThread().getName().equals("Thread-4")){
                    	lock.lock();
                    	wait4=true;
                     	System.out.println("Child (Jeff): Not Enough Cookies must wait ... ");
                     	mom.signal(); 
                     	MasterLock4.await();
                     	
                     }
                     if(Thread.currentThread().getName().equals("Thread-3")){
                    	 lock.lock();
                    	 wait3=true;
                     	System.out.println("Child (Joe): Not Enough Cookies must wait ...");
                     	mom.signal();
                     	MasterLock3.await();
                     	
                     }
                     if(Thread.currentThread().getName().equals("Thread-2")){
                    	 lock.lock();
                    	 wait2=true;
                     	System.out.println("Child(Bob): Not Enough Cookies must wait ...");
                     	mom.signal(); 
                     	MasterLock2.await();
                     	
                     }
          			if(Thread.currentThread().getName().equals("Thread-1")){
          				lock.lock();
          				wait1=true;
          				mom.signal(); 
          				MasterLock1.await();
          				
          				System.out.println("Child (Billy): Not Enough Cookies must wait ... ");
          			}
          			
                 lock.unlock();
                    
                }
                
                
                	
                	while(value> 0 && queue.size()>0){
                    value--;
                    actate++;
                    queue.remove();
                	}
                	numofkids--;
                    if(Thread.currentThread().getName().equals("Thread-4")){
                 	  
                 	 System.out.println("Child (Jeff): ate "+actate+" cookies.");
                    	 System.out.println("Child (Jeff) Leaves the room now " + numofkids + " Children and " + queue.size() + " Cookies are in the room");
                    }
                    if(Thread.currentThread().getName().equals("Thread-3")){
                 	   
                 	   System.out.println("Child (Joe): ate "+actate+" cookies.");
                    	 System.out.println("Child (Joe) Leaves the room now " + numofkids + " Children and " + queue.size() + " Cookies are in the room");
                    }
                    if(Thread.currentThread().getName().equals("Thread-2")){
                 	   
                 	   System.out.println("Child (Bob): ate "+actate+" cookies.");
                    	 System.out.println("Child (Bob) Leaves the room now " + numofkids + " Children and " + queue.size() + " Cookies are in the room");
                    }
                    if(Thread.currentThread().getName().equals("Thread-1")){
                 	   
                 	   System.out.println("Child (Billy): ate "+actate+" cookies.");
         				System.out.println("Child (Billy) Leaves the room now " + numofkids + " Children and " + queue.size() + " Cookies are in the room");     			
         			}
                    
               
                
                
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
            finally
            {
            	
              
                sem.release(); // Return the room key
                return actate;
            }
        }
    }
}
