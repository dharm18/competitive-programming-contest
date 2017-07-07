import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		List<String> files = new ArrayList<>();
		//files.add("D://engineering.stackexchange.com/Users.xml");
		files.add("D://engineering.stackexchange.com/Votes.xml");
		files.add("D://engineering.stackexchange.com/Tags.xml");
		files.add("D://engineering.stackexchange.com/Posts.xml");
		files.add("D://engineering.stackexchange.com/PostLinks.xml");
		//files.add("D://engineering.stackexchange.com/PostHistory.xml");
		files.add("D://engineering.stackexchange.com/Comments.xml");
		files.add("D://engineering.stackexchange.com/Badges.xml");
		
		long start = System.nanoTime();
		SerialProcessingTest test = new SerialProcessingTest();
		test.readTheContent(files);
		long end = System.nanoTime();
		System.out.println(((end-start)/1000000000)+" seconds to execute");
		
		start = System.nanoTime();
		ParallelProcessingTest test2 = new ParallelProcessingTest();
		test2.readTheContent(files);
		
		end = System.nanoTime();
		System.out.println(((end-start)/1000000000)+" seconds to execute");
		
		//sc.close();
		
		//Thread.yield();
		
	}

}
