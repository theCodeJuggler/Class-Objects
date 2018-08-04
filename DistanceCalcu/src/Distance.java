//Program to accept distance in Feet and Inches and find out their sum and display them 
public class Distance {
	
	private int feet;
	private float inches;
	
	//Setter Function to set the instance variable from the inputed values.
	void set(int feet, float inches)
	{
		this.feet = feet;
		this.inches = inches;
	}
		
	//Function to add the distances in feet and inches separately
	Distance add(Distance dist1, Distance dist2, Distance distSum)
	{
		distSum.feet = dist1.feet + dist2.feet; 		//adding the feet component of the distance 
		distSum.inches = dist1.inches + dist2.inches; 	// adding the inches component of the distance.
		
		//To convert inches to feet when inches exceed 12inches in length
		int copyInches;
		if(distSum.inches>=12)
		{
			copyInches = (int) distSum.inches/12;
			distSum.inches = distSum.inches%12;
			distSum.feet+=copyInches;
		}
		
		return distSum;
	}

	//Function to display both the input distances as well as the total distance
	@Override
	public String toString() {
		return "Distance :: " + feet + "feet " + inches +"inches";
	}
	
	
}
