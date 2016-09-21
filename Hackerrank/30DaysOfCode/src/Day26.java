import java.util.Calendar;
import java.util.Scanner;


public class Day26 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String actualDateString = in.nextLine();
        String dueDateString = in.nextLine();
        String actualDateArray[] = actualDateString.split(" ");
        String dueDateArray[] = dueDateString.split(" ");
        Calendar actualDate = Calendar.getInstance();
        actualDate.set(Integer.parseInt(actualDateArray[2]), Integer.parseInt(actualDateArray[1])-1, Integer.parseInt(actualDateArray[0]),0,0,0);
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(Integer.parseInt(dueDateArray[2]), Integer.parseInt(dueDateArray[1])-1, Integer.parseInt(dueDateArray[0]),0,0,0);
        //System.out.println(actualDate.getTime());
        //System.out.println(dueDate.getTime());
        
        double fine = 0;
        if(actualDate.before(dueDate) || actualDate.equals(dueDate)){
        	fine = 0;
        }
        else if(actualDate.get(Calendar.MONTH) == dueDate.get(Calendar.MONTH) && actualDate.get(Calendar.YEAR) == dueDate.get(Calendar.YEAR)){
        	long diffInDays = (actualDate.getTimeInMillis() - dueDate.getTimeInMillis())/(24*60*60*1000);
        	fine = 15*diffInDays;
        }
        else if (actualDate.get(Calendar.YEAR) == dueDate.get(Calendar.YEAR)){
        	fine = 500*(actualDate.get(Calendar.MONTH) - dueDate.get(Calendar.MONTH));
        }
        else if(actualDate.after(dueDate)){
        	fine = 10000;
        }
        System.out.println(fine);
        in.close();
	}

}
