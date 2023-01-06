/* Title: Weather System
        Abstract: It's a weather system where the system predicts temperature in Celsius
				  cloud level, wind speed, precipitation, etc.

        Author: Prajwal Pisal

        Date: 18 October 2021 */

import java.util.Random;

public abstract class Measurement{
    private double value;
    private String unit;
    private String usUnit;
    
    public Measurement()
    {
    	Random r = new Random();
		int lowTemprature = -20;
		int highTemprature = 20;
		this.value = r.nextInt(highTemprature-lowTemprature) + lowTemprature;
		//System.out.println("Measurement : "+this.value);
    }
    
    public Measurement(double value, String unit, String usUnit) {
        this.value = value;
        this.unit = unit;
        this.usUnit = usUnit;
        //System.out.println("Mesurment constructor "+this.value+this.unit+"  "+this.usUnit);
    }

    public double getValue() {
        return this.value;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override
    public String toString() {
        return String.format("%d %s/%d %s",
                Math.round(this.value),
                this.unit,
                Math.round(this.getUsValue()),
                this.getUsUnit());
    }

    public abstract double getUsValue();
    public String getUsUnit() {
        return this.usUnit;
    }

}
