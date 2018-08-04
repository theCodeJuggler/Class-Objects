//Program to accept complex in real and imaginary component and find out their sum and display them 
class Complex {
	
	float real;
	float imaginary;
	
	//Setter Function to set the instance variable from the inputed values.
	void set(float rl, float im)
	{
		real = rl;
		imaginary = im; 
	}
	
	//Function to add the complex numbers with real and imaginary parts separately
	Complex sum(Complex cmplx1, Complex cmplx2, Complex addCmplx)
	{
		addCmplx.real = cmplx1.real + cmplx2.real;					//adding the real component of the complex numbers 
		addCmplx.imaginary = cmplx1.imaginary + cmplx2.imaginary;	//adding the imaginary component of the complex numbers
		
		return addCmplx;
		
	}

	//Function to display both the input distances as well as the total distance
	@Override
	public String toString() {
		return "Complex Number :: " + real + "+" + imaginary + "i";
	}
	
}
