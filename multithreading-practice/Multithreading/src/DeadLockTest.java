
public class DeadLockTest {

	static Object lock1 = new Object();
	static Object lock2 = new Object();
	
	static class ThreadOne implements Runnable{

		@Override
		public void run() {
			synchronized (lock1) {
				System.out.println(Thread.currentThread().getName() + " - Got lock on lock1");
				synchronized (lock2) {
					System.out.println(Thread.currentThread().getName() + " - Got lock on lock2");
				}
			}
		}
		
	}
	
	static class ThreadTwo implements Runnable{

		@Override
		public void run() {
			synchronized (lock2) {
				System.out.println(Thread.currentThread().getName() + " - Got lock on lock2");
				synchronized (lock1) {
					System.out.println(Thread.currentThread().getName() + " - Got lock on lock1");
				}
			}
		}
		
	}

	
	public static void main(String[] args) {
		
		new Thread(new ThreadOne(),"ThreadOne").start();
		new Thread(new ThreadTwo(),"ThreadTwo").start();

	}

}
