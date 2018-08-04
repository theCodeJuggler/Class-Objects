class Rectangle {
	double length;
	double width;
	
	Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	double area()
	{
		double ar;
		
		ar=length*width;
		
		return ar;
	}
	
	double perimeter()
	{
		double peri;
		
		peri = 2*(length+width);
		
		return peri;
	}
}
