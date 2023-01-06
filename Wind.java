/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

import java.util.Random;

public class Wind extends Speed{

	public static int windLevel;
	public static String direction;
	public Wind() {
		Random r = new Random();
		int lowLevel = 0;
		int highLevel = 15;
		windLevel = r.nextInt(highLevel-lowLevel) + lowLevel;
		//System.out.println("wind : "+windLevel);
		direction();
	}
	
	
	private void direction() {
		Random r = new Random();
		int lowLevel = 0;
		int highLevel = 2;
		int dire = r.nextInt(highLevel-lowLevel) + lowLevel;
		//System.out.println("Direction : "+dire);
		if(dire==0)
			direction="south";
		if(dire==1)
			direction="north";
			
		
	}


	@Override
	public String toString() {
		return "WindLebel : "+windLevel;
	}
	
}
