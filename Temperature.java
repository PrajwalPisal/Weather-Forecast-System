/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

import java.util.Random;

public class Temperature  extends Measurement{

	private String UNIT="C";
	private String USUNIT="F";

	private static CloudLevel cl;
	private static int flag=0;//0 am 1 pm
	public static double tValu;
	public Temperature()
	{
		
		tValu=getValue();
	}
	
	public Temperature(Temperature pm,Wind wind,Precipitation precipitation)
	{
		super(tValu,pm.UNIT,pm.USUNIT);
		//System.out.println("Temperature(Temperature pm,Wind wind,Precipitation precipitation)");
		
		flag=1;
	}
	
	public Temperature(Temperature am,CloudLevel clouds)
	{
		super(tValu,am.UNIT,am.USUNIT);
		cl=clouds;
		//System.out.println("Temperature(Temperature am,CloudLevel clouds)");
		flag=0;
		
	}

	@Override
	public double getUsValue() {
		if(flag==0)
		{
			//System.out.println("Morning flag");
			return (((this.getValue()*9)/5)+32);
		}
		else
		{
			//System.out.println("midday flag : "+cl.getTempratureChange());
			return (((cl.getTempratureChange()*9)/5)+32);
		}
		
	}

	@Override
	public String toString() {
		if(flag==0){
			//System.out.println("Morning");
		return "Morning  Temperature : "+Math.round(this.getValue())  +" "+ this.getUnit() + " / " +Math.round(this.getUsValue())+ " "+this.getUsUnit() ;
		}
		else{
			//System.out.println("Middy");
			return "Midday  Temperature : "+Math.round(cl.getTempratureChange())  +" "+ this.getUnit() + " / " +Math.round(this.getUsValue())+ " "+this.getUsUnit() ;
		}
		}
	
	

}
