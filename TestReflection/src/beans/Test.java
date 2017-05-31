package beans;

public class Test {
	static int i=0;
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				/*while(true){
					if(i==10)
						break;
					i++;
					i*=10;
					System.out.println(i);
				}*/
				System.out.println("Thread 1 " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1 completed " + Thread.currentThread().getName());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				/*while(true){
					if(i==100)
						break;
					i--;
					i*=10;
					System.out.println(i);
				}	*/
				System.out.println("Thread 2 " + Thread.currentThread().getName());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2 completed " + Thread.currentThread().getName());
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					if(i==100)
						break;
					i++;
					i*=10;
					System.out.println(i);
				}		
			}
		});
		
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					if(i==100)
						break;
					i--;
					i*=10;
					System.out.println(i);
				}		
			}
		});
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();
		//t.start();
		try {
			//t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("Shutdown initiated " + Thread.currentThread().getName());
		return;
	}
}
