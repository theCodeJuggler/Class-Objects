//Driver program to test Television class
import java.io.*;
class TelevisionTest {

	public static void main(String args[])throws IOException
	{
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
		
		Television tv = new Television();
		int choice, choiceVolume, channel;
		do
		{
			
			if(tv.state==0) //checking if tv is off or on
			{
				System.out.println("Press 1 to Switch Television set");
				choice = Integer.parseInt(in.readLine());
				tv.onOff(); //calling function to switch tv on
			}
			else
			{
				//accept user choice
				System.out.println("Press The Number To Choose Option.");
				System.out.println("1. Switch Television OFF\n2. Increase Volume\n3. Decrease Volume\n4. Change Channel\n5. Get Information");
				System.out.print("Enter Your Choice :: ");
				choice = Integer.parseInt(in.readLine());
				
				switch(choice)
				{
				case 1:
					System.out.println("TV Has Been Switched OFF");
					tv.onOff(); //calling function to switch tv off
					break;
				
				case 2:	//Displaying current volume and calling incrsVolume() to increase volume by 1
					choiceVolume = 0;
					System.out.println("---------------------------------------------------");
					do
					{
						System.out.println("Volume :: "+tv.getVolume());
						tv.incrsVolume(); 
						System.out.println("Press 1 to exit Volume mode \nPress 0 to continue increasing");
						choiceVolume = Integer.parseInt(in.readLine());
					}
					while(choiceVolume==0);
					System.out.println("---------------------------------------------------");
					break;
					
				case 3:	//Displaying current volume and calling decrsVolume() to decrease volume by 1
					choiceVolume = 0;
					System.out.println("---------------------------------------------------");
					do
					{
						System.out.println("Volume :: "+tv.getVolume());
						tv.decrsVolume();
						System.out.println("Press 1 to exit Volume mode \nPress 0 to continue decreasing");
						choiceVolume = Integer.parseInt(in.readLine());
					}
					while(choiceVolume==0);
					System.out.println("---------------------------------------------------");
					break;
					
				case 4: //Display current channel number and change channel
					System.out.println("---------------------------------------------------");
					System.out.println("Current Channel Number :: "+tv.getCurrentChannel());
					System.out.print("Enter The Channel Number ::");
					channel = Integer.parseInt(in.readLine());
					tv.chngChannel(channel);
					System.out.println("---------------------------------------------------");
					break;
					
				case 5: //Display state informations about television
					System.out.println("---------------------------------------------------");
					System.out.println("Information");
					if(tv.state==0)
						System.out.println("Television State :: OFF");
					else
					{
						System.out.println("Television State :: ON");
						System.out.println("Channel Number :: "+tv.getCurrentChannel());
						System.out.println("Current Volume :: "+tv.getVolume());
						
					}
					System.out.println("---------------------------------------------------");
					break;
					
				default:
					System.out.println("No Such Options exists !!");
				}
			}
		}
		while(tv.state==1);
	}
}
