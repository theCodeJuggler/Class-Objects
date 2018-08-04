////Program to accept time in Hours and Minutes and find out their sum and display them 
public class Time {

	int hours;
	int minutes;
	
	//Setter Function to set the instance variable from the inputed values.
	void setTime(int hrs, int mins)
	{
		hours = hrs;
		minutes = mins;
	}	
	
	//Function to add the times in hours and minutes separately
	Time sum(Time time1 , Time time2 , Time addedTime)
	{
		addedTime.hours = time1.hours + time2.hours;
		addedTime.minutes = time1.minutes + time2.minutes;
		
		if(addedTime.minutes>60)
		{
			addedTime.hours = (int)(addedTime.hours+addedTime.minutes/60);
			addedTime.minutes = addedTime.minutes % 60;
		}
		
		return addedTime;
	}

	//Function to display both the input as well as the total times 
	@Override
	public String toString() {
		return " "+hours + " : " + minutes;
	}
}
