//Creating television set
public class Television {

	protected int state;
	private int currentVol;
	private int currentChannel;
	
	//to increase the volume by 1
	void incrsVolume()
	{
		currentVol+=1;
		
	}
	
	//to decrease the volume by 1
	void decrsVolume()
	{
		currentVol-=1;
	}
	
	//to change the channel number
	void chngChannel(int channel)
	{
		currentChannel = channel;
	}
	
	//switch on/off tv
	void onOff()
	{
		if(state == 0)
			state = 1;
		else
			state = 0;
	}
	
	//return volume to main method
	int getVolume()
	{
		return currentVol;
	}
	
	//return current channel
	int getCurrentChannel()
	{
		return currentChannel;
	}

}
