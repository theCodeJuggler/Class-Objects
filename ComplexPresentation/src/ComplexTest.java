//Driver program to test the Complex class.
import java.io.*;
public class ComplexTest {
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the 1st complex number in real and imaginary components
		System.out.println("Enter The Real and Imaginary Numbers :: " );
		float real1 = Float.parseFloat(in.readLine());
		float imaginary1 = Float.parseFloat(in.readLine());
		
		//Accepting the 2nd complex number in real and imaginary components
		System.out.println("Enter The Real and Imaginary Numbers :: " );
		float real2 = Float.parseFloat(in.readLine());
		float imaginary2 = Float.parseFloat(in.readLine());
		
		
		Complex complxno1 = new Complex();	//object for 1st complex number
		Complex complxno2 = new Complex();	//object for 2nd complex number
		Complex resultCmplx = new Complex();//object for addition result of complex number
		
		//calling the set method each time to set the real and imaginary component of each complex number
		complxno1.set(real1, imaginary1);
		complxno2.set(real2, imaginary2);
		
		//calling the add function with objects as the parameters
		resultCmplx.sum(complxno1, complxno2, resultCmplx);
		
		//displaying the inputed as well as the Addition result
		System.out.println("1st Complex Number :: "+complxno1);
		System.out.println("2nd Complex Number :: "+complxno2);
		System.out.println("Total :: "+resultCmplx);
		
	}
}
