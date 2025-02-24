import java.util.*;
class height{
	public static void main(String[]args){
		Scanner height=new Scanner(System.in); //for taking input
	System.out.println("Enter your height in cm=");
	double height_cm=height.nextDouble();//input for height in cm
	double height_inch=height_cm/2.54;//converting height from cm to inch
	double height_foot=(int)height_inch/12;//calculating feet from inch
	height_inch=height_inch%12;//updating the value of inch
	System.out.println("Your Height in cm is "+height_cm+" while in feet is "+height_foot+" and inches is"+height_inch);
	}
}