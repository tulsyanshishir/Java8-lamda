package java8Lamda;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThreadLamda = new Thread(()->System.out.println("I am Running, Like Never Before with Lamda Leaps"));		
		myThreadLamda.run();
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I am Running, Like Never Before inside Runnable");
				
			}
		});
		
		myThread.run();
	}
}



  
 