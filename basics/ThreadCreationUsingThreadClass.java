package basics;

class Test2 extends Thread {
	
	public void run() {
		System.out.println("Using Thread Class");
	}
}

public class ThreadCreationUsingThreadClass {

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		
		t1.start();
	}
}
