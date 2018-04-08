import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		/*List<Double> prices = new ArrayList<Double>();
		prices.add(new Integer(42));
		prices.add(42.0);*/
		
		/*List<Tree> t = new ArrayList<Tree>();
		List<Plant> p = t;
		p.add(new Tree());*/
		List<Tree> t = new ArrayList<Tree>();
		t.add(new Tree());
		List< ? extends Plant> p = t;
		//Tree plant = p.get(0);
		//p.add(new Tree());
		//Collections.min
	}
}

class Plant{
	
}
class Tree extends Plant{
	
}
