package test;

public class TestSingletonPattern {

	private static volatile TestSingletonPattern INSTANCE;
	
	private TestSingletonPattern(){}

	//double checked locking
	public TestSingletonPattern getInstance(){
		if(INSTANCE == null){
			synchronized (TestSingletonPattern.class) {
				if(INSTANCE == null){
					INSTANCE = new TestSingletonPattern();
				}
			}
			
		}
		return INSTANCE;
	}
	
}
