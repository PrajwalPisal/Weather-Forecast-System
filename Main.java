/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

public class Main {

	public static void main(String[] args) {
		
		int snowflag=0;
	for(int i=1;i<=10;i++)
	{
		System.out.println("Weather for Day "+i);
		Temperature t=new Temperature();
		CloudLevel cl=new CloudLevel();
		Temperature t1=new Temperature(t, cl);
		System.out.println(t1);
		System.out.println(cl);
		
		
	
		Precipitation p;
		Height h;
		Snow s = null;
		Rain r=null;
		if(CloudLevel.middyTemp<=0)
		{
			//System.out.println("Its Snow");
			s=new Snow();
			h=new Height(Snow.snowLevel);
			p=new Precipitation(h, "Snow");
			Snow s2=new Snow(h);
			snowflag=0;
		}
		else
		{
			//System.out.println("Its RAiny");
			r =new Rain();
			h=new Height(Rain.rainLevel);
			Rain r2=new Rain(h);
			p=new Precipitation(h, "Rain");
			snowflag=1;
		}

		
		
		WindLevel windLevel=new WindLevel();
		Speed sp=new Speed(Wind.windLevel);
		WindLevel windLevel2=new WindLevel(sp);
		
		windLevel.getTempratureChange();
		Temperature t2=new Temperature(t, windLevel, p);
		System.out.println(t2);
		if(snowflag==0)
			System.out.println(p.toString()+s);
		if(snowflag==1)
			System.out.println(p.toString()+r);	
		System.out.println(windLevel2);
		System.out.println("\n");
	}	
	}
}
