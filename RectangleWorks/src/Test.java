import java.io.*;
class Test {
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter The Length and Width of the 1st Rectangle ::");
		double len1 = Double.parseDouble(in.readLine());
		double wid1 = Double.parseDouble(in.readLine());
		
		System.out.println("Enter The Length and Width of the 2nd Rectangle ::");
		double len2 = Double.parseDouble(in.readLine());
		double wid2 = Double.parseDouble(in.readLine());
		
		Rectangle rect1 = new Rectangle(len1,wid1);
		Rectangle rect2 = new Rectangle(len2,wid2);
		
		if(len1!=len2 && wid1!=wid2)
		{
			if(rect1.area()!=rect2.area())
				System.out.println("Area is not same");
			else
				System.out.println("Area is same");
		}
		else
			System.out.println("Area is same");
		
		System.out.println("Rectangle 1 :: Area = "+rect1.area()+" Perimeter = "+rect1.perimeter());
		System.out.println("Rectangle 2 :: Area = "+rect2.area()+" Perimeter = "+rect2.perimeter());
	}
}
