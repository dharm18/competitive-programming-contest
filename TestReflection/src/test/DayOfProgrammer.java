package test;

import java.util.Scanner;

public class DayOfProgrammer {

	static int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int y = in.nextInt();
	     in.close();
	     int febDays = 28;
	     //range check
	     if(y<=1700 || y>=2700){
	    	 return;
	     }
	     //1918
	     if(y==1918){
	    	 febDays = 14;
	     }
	     else if(y < 1918){//julian calculation
	    	 febDays = y%4==0 ? 29 : 28;
	    	 //System.out.println("julian " + febDays);
	     }
	     else{//gregorian calculation
	    	 if( y%400 == 0 || (y%4 == 0 && y%100 != 0)){
	    		 febDays = 29;
	    	 }
	     }
	     //calculations
	     int totaldays = febDays,month=0;
	     for(int i=0;i<12;i++){
	    	 if(i!=1) {
	    		 if(totaldays + daysOfMonth[i] > 256){
	 	    		break; 
	 	    	 }
	    		 totaldays += daysOfMonth[i];
	    		 month = i;
	    	 }
	     }
	     int day = 256-totaldays;
	     if(day>0){
	    	 month+=1;
	     }
	     else{
	    	 day = daysOfMonth[month];
	     }
	     //System.out.println(day+"."+(month+1)+"."+y);
	     System.out.format("%02d.%02d.%d", day,month+1,y); 
	}

}
