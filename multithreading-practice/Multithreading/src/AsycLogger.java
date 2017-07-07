import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AsycLogger{

	boolean running = true;
	static BufferedInputStream reader;
	public static void main(String[] args) {
	
		try {
			 reader = new BufferedInputStream(new FileInputStream("D://Dharam/apache-tomcat-7.0.70/logs/catalina.2017-04-11.log"));
			 AsycLogger async = new AsycLogger();
			 async.run();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		try {
			while( running ) {
			    if( reader.available() > 0 ) {
			        System.out.print( (char)reader.read() );
			    }
			    else {
			        try {
			            Thread.sleep( 500 );
			        }
			        catch( InterruptedException ex ) {
			            running = false;
			        }
			    }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
