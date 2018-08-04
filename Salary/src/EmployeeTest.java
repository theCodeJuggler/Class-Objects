//Driver program for Employee class
import java.io.*;
public class EmployeeTest {

	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting ID and Name
		System.out.println("Enter Name And ID ::");
		String name = in.readLine();
		String ID = in.readLine();
		//Accepting monthly basic salary and PF rate
		System.out.println("Enter The Monthly Basic :: ");
		double monthlyBasic = Double.parseDouble(in.readLine());
		System.out.println("Enter The PF Rate :: ");
		float pfRate = Float.parseFloat(in.readLine());
		
		Employee employee = new Employee(ID,name,monthlyBasic);
		employee.setPFRate(pfRate);
		
		System.out.println("Annual Basic Salary :: Rs. "+employee.getAnnualBasic());
		System.out.println("Monthly Gross Salary :: Rs. "+employee.getMonthlyGrossSalary());
		System.out.println("Annual Gross Salary :: Rs. "+employee.getAnnualGrossSalary());
		System.out.println("Monthly Deductions :: Rs. "+employee.getMonthlyDeductions());
		System.out.println("Monthly Take Home :: Rs. "+employee.getMonthlyTakeHome());
		System.out.println("Annual Take Home :: Rs. "+employee.getAnnualTakeHome());
	}
}
