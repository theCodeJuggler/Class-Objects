//Driver program to test the Time class.
import java.io.*;
public class TimeTest {

	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the 1st time in hour and minutes from the user
		System.out.println("Enter 1st Time -> " );
		int hrs1 = Integer.parseInt(in.readLine());
		int mins1 = Integer.parseInt(in.readLine());
				
		//Accepting the 2nd time in hour and minutes from the user
		System.out.println("Enter 2nd Time -> " );
		int hrs2 = Integer.parseInt(in.readLine());
		int mins2 = Integer.parseInt(in.readLine());
		
		Time time1 = new Time();	//object for 1st Time
		Time time2 = new Time();	//object for 2nd Time
		Time timeSum = new Time();	//object for the resultant total Time
		
		//calling the set method each time to set the hours and minutes component of each time
		time1.setTime(hrs1, mins1);
		time2.setTime(hrs2, mins2);
				
		//calling the add function with objects as the parameters
		timeSum.sum(time1, time2, timeSum);
		
		//displaying the inputed as well as the Addition result
		System.out.println("1st Time :: "+time1);
		System.out.println("2nd Time :: "+time2);
		System.out.println("Total Time :: "+timeSum);
				
	}
}
