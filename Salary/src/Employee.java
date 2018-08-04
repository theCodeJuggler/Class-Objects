//Class to calculate salary components of the employee 
public class Employee {

	private String Id;
	private String name;
	private static double monthlyBasic;
	static final double medAllwnc = 1250;
	static final double convAllwnc = 800;
	static double pf;
	static final double esic = 4.75;
	
	Employee(String ID, String name, double monthlyBasic)
	{
		Id = ID;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}
	//calculating annual basic salary
	double getAnnualBasic()
	{
		return (12*monthlyBasic);
	}
	
	//calculating monthly gross salary
	double getMonthlyGrossSalary()
	{
		return (monthlyBasic+(50/100*monthlyBasic)+medAllwnc+convAllwnc);
	}
	
	//calculating Annual gross salary
	double getAnnualGrossSalary()
	{
		return (12*getMonthlyGrossSalary());
	}
	
	//setting the pf
	void setPFRate(float f)
	{
		if((f/100*monthlyBasic)<6500)
			pf = (double)(f/100*monthlyBasic);
		else
			pf = 6500;
	}
	
	//returning the pf
	double getPFRate()
	{
		return pf;
	}
	
	//calculating monthly deductions
	double getMonthlyDeductions()
	{
		double profTax;
		if(monthlyBasic<=10000)
			profTax = 50;
		else
			profTax = 100;
		
		return (pf+esic+profTax);
	}
	
	//calculating monthly take home
	double getMonthlyTakeHome()
	{
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	
	//calculating annual salary to be taken home
	double getAnnualTakeHome()
	{
		return (12*getMonthlyTakeHome());
	}
}
