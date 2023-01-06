/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

public class Precipitation extends Height{
	private String type;
	public Precipitation()
	{
		
	}
	
	public Precipitation(Height amount,String type)
	{
		this.type=type;
		
	}
	
	@Override
	public String toString() {
			return "Precipitation :  ";
	}
	
}
