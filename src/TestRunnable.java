
public class TestRunnable implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			char caractere = (char) ('\u0021' + i);
			System.out.print(caractere);
			for(int j = 1; j < i + 2; j++) {
				System.out.print("*");
			}
			System.out.println(caractere);
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start(); 
	}
}
