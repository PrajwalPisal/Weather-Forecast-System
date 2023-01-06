/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

public class WindLevel extends Wind {
	
	private static  Speed speed;
	public WindLevel(Speed speed)
	{
		this.speed=speed;
	}
	public Speed getSpeed() {
		return speed;
	}
	public WindLevel(){
	
	}
	public double getTempratureChange()
	{  
		if(Wind.direction.equals("south"))
		{
			return Temperature.tValu+(0.5*speed.getValue());
		}
		else
		{
			return Temperature.tValu-(0.65*speed.getValue());
		}
	}
	
	@Override
	public String toString() {

		return "Wind : "+Math.round(speed.getValue()) +" "+speed.getUnit()+" / "+Math.round(speed.getUsValue())+" "+speed.getUsUnit();
	}

}
