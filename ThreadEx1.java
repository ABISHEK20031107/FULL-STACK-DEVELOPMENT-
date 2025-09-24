package Thread;

class ThreadEx1 extends Thread {

	
	public static void main(String[]args) {
		ThreadEx1 tp=new ThreadEx1();
		tp.start();
		System.out.println("The code is running outside The Thread");
		
	}
	public void run()
	{
		System.out.println("The code is running inside the Thread");
	}
}
