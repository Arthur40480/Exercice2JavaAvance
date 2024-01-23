
public class TestThread extends Thread {
	
	public TestThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.print(this.getName());
		}	
		System.out.println();
	}
	
	public static void main(String[] args) {
		Thread t = new TestThread("1- ");
		Thread t1 = new TestThread("2-- ");
		Thread t2 = new TestThread("3--- ");
		Thread t3 = new TestThread("4---- ");
		Thread t4 = new TestThread("5----- ");
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
