/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

public class Speed extends Measurement{
	private static String UNIT="kph";
	private static String USUNIT="mph";
	
	public Speed(double value) {
		super(value,UNIT,USUNIT);
	}
	
	public Speed(){}

	@Override
	public double getUsValue() {
		return getValue() / 1.609344;
	}

}
