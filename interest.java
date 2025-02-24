import java.util.*;
class interest{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
System.out.println("Enter principle amount=");
double principle=in.nextDouble();//input for principle amount
System.out.println("Enter rate amount=");
double rate=in.nextDouble();//input for rate of interest
System.out.println("Enter time period=");
double time=in.nextDouble();//input for time period
double interest=(principle*rate*time)/100;//calculate interest amount
System.out.println("The Simple Interest is "+interest+" for Principal "+principle+", Rate of Interest "+rate+" and Time "+time);
}
}