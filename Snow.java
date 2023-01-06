/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

import java.util.Random;

public class Snow extends Precipitation{
	
	public static int snowLevel;
	public static Height height;
	public Snow()
	{
		Random r = new Random();
		int lowLevel = 0;
		int highLevel = 40;
		snowLevel = r.nextInt(highLevel-lowLevel) + lowLevel;
		//System.out.println("snowLevel : "+snowLevel);
	}
	public Snow(Height h)
	{
		height=h;
	}
	
	public double getTempratureChange()
	{
		return getValue()-(snowLevel*.15);
	}
	@Override
	public String toString() {
		return  snowLevel+" "+height.getUnit()+" / "+Math.round(height.getUsValue())+" "+height.getUsUnit()+" of Snow";
	}
}
