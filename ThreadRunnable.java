package Thread;

class Book implements Runnable
{

	@Override
	public void run()
	{
		System.out.println("Do a Task");
	}

}
public class ThreadRunnable 
{

	public static void main(String[] args) {

		
		Thread t1=new Thread(new Book(),"Book Thread");
				
			t1.start();
			System.out.println("Thread with name"+" "+t1.getName());
				}
	}


