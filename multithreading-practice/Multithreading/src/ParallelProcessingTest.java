import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelProcessingTest {

	ExecutorService executorService = Executors.newFixedThreadPool(10);
	
	public void readTheContent(List<String> files){
		
		
		for (final String string : files) {
			
			executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					SerialProcessingTest t = new SerialProcessingTest();
			    	t.readXMLDocuments(string);
				}
			});
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()){}
		
		System.out.println("All tasks completed");
		
		
	}

	
}
