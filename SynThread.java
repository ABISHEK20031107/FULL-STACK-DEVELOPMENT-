package Synchronize;

public class SynThread {
      int count=0;
      
      public synchronized void increment() 
      {
    	  count++;
      }
	public static void main(String[] args) throws InterruptedException
	{
		SynThread obj=new SynThread();
		
		Thread t1=new Thread(()->
		{
			for(int i=0;i<1000;i++) 
				obj.increment();
			obj.increment();			
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<1000;i++) {
				obj.increment();
			}
		});
		
		t1.start();
		
		t2.start();
		
		t1.join();
		
		t2.join();

		System.out.println("First Count"+obj.count);
	}

}
