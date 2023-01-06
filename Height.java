/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */
public class Height extends Measurement {
	private static String UNIT="cm";
	private static String USUNIT="in";
	
	public Height() {
	}
	
	public Height(double value) {
		super(value,UNIT,USUNIT);
		//System.out.println("Height Object Cretaed : "+getValue());
	}
	
	public double getUsValue()
	{
		//System.out.println("getUsValue : Hieht "+getValue());
		//System.out.println("hiet us value : "+getValue()*0.3937);
		return getValue()*0.3937;
	}
	
}
