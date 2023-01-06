/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

import java.util.Random;

public class CloudLevel extends Temperature{
	
	private int level;
	public static double middyTemp;
	public CloudLevel()
	{
		Random r = new Random();
		int lowLevel = 1;
		int highLevel = 5;
		this.level = r.nextInt(highLevel-lowLevel) + lowLevel;
	   // System.out.println("cloud Level : "+this.level);
		getTempratureChange();
	}
	public int getLevel() {
		return level;
	}
	
	public String getLevelLabel() {
		if(this.getLevel()==2)
			return "Light";//+3
		else if (this.getLevel()==3)
			return "Heavy";//-5
		else if (this.getLevel()==4)
			return "Medium";//-3
		return "None";//+6
		
	}
	
	public double getTempratureChange()
	{
		if(this.getLevel()==2)
			middyTemp=getValue()+3;
		else if (this.getLevel()==3)
			middyTemp=getValue()-5;
		else if (this.getLevel()==4)
			middyTemp=getValue()-3;
		else
			middyTemp=getValue()+6;
		//System.out.println(" cloud middy : "+middyTemp);
		return middyTemp;
	}
	
	@Override
	public String toString() {
		return "Clouds : "+this.getLevelLabel();
	}
	
	

}
