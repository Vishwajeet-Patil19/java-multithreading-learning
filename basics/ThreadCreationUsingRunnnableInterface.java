package practice_codes;

class Test implements Runnable {

	@Override
	public void run() {
		System.out.println("Using Runnable Interface");	
	}
	
}

public class ThreadCreationUsingRunnnableInterface {
	
	public static void main(String[] args) {
		Test t1 = new Test();
		
		Thread th1 = new Thread(t1);
		
		th1.start();
	}
}
