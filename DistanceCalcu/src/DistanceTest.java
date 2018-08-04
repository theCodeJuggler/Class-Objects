//Driver program to test the Distance class.
import java.io.*;
public class DistanceTest{
	
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the 1st distance in feet and inches from the user
		System.out.println("Enter Feet and Inches for 1st Distance :: " );
		int feet1 = Integer.parseInt(in.readLine());
		float inches1 = Float.parseFloat(in.readLine());
		
		//Accepting the 2nd distance in feet and inches from the user
		System.out.println("Enter Feet and Inches for 2nd Distance :: " );
		int feet2 = Integer.parseInt(in.readLine());
		float inches2 = Float.parseFloat(in.readLine());
		
		Distance distance1 = new Distance();	//object for 1st distance
		Distance distance2 = new Distance();	//object for 2nd distance
		Distance distanceSum = new Distance();	//object for the resultant total distance
		
		//calling the set method each time to set the feet and inches component of each distance
		distance1.set(feet1, inches1);
		distance2.set(feet2, inches2);
		
		//calling the add function with objects as the parameters
		distanceSum.add(distance1, distance2, distanceSum);
		
		//displaying the inputed as well as the Addition result
		System.out.println("1st Distance :: "+distance1);
		System.out.println("2nd Distance :: "+distance2);
		System.out.println("Total Distance :: "+distanceSum);
		
	}
}
