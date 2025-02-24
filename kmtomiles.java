import java.util.*;
class kmtomiles{
	public static void main(String[]args){
		Scanner dis=new Scanner(System.in); //for taking input
	System.out.println("Enter distance in km=");
	double dis_km=dis.nextDouble();//input for dist. in km
	double dis_miles=dis_km/1.6;//convertinh km to miles
	System.out.println(" The total miles is "+dis_miles+" mile for the given "+dis_km+" km");
	}
}