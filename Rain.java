/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

import java.util.Random;

public class Rain extends Precipitation {
	
	public static int rainLevel;
	public static Height height;
	public Rain()
	{
		Random r = new Random();
		int lowLevel = 0;
		int highLevel = 5;
		rainLevel = r.nextInt(highLevel-lowLevel) + lowLevel;
		//System.out.println("rainLevel : "+rainLevel);
	}
	public double getTempratureChange()
	{
		return height.getValue()-(rainLevel*.9);
	}
	public Rain(Height h)
	{
		height=h;
	}
	@Override
	public String toString() {
		return  rainLevel+" "+height.getUnit()+" / "+Math.round(height.getUsValue())+" "+height.getUsUnit()+ " of Rain";
	}
}
