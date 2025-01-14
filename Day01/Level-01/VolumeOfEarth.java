import java.lang.*;
public class VolumeOfEarth{
	public static void main(String[] args){
		double radiusOfEarthKm= 6378;
		double radiusOfEarthMiles= radiusOfEarthKm*0.6;
		double volumeOfEarthKm= (4.0/3.0)*Math.PI*(Math.pow(radiusOfEarthKm,3));
		double volumeOfEarthMiles= (4.0/3.0)*Math.PI*(Math.pow(radiusOfEarthMiles,3));
		System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthKm + " and cubic miles is " + volumeOfEarthMiles);
	}
}