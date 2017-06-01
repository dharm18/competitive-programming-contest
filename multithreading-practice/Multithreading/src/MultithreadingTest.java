import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		System.out.println("Process is started");
		final MultithreadingTest t1 = new MultithreadingTest();
		
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(t1.addElement(10));
			}
		});
		
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(t1.addElement(20));
			}
		});
		
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(t1.addElement(30));
			}
		});
		
		executorService.shutdown();
		
		System.out.println("Process is terminated");
		
	}
	
	public List<Integer> addElement(int a){
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(a+10);
		list.add(a+20);
		list.add(a+30);
		return list;
	}
	
}
