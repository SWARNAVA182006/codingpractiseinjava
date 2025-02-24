import java.util.*;
class celsius{
public static void main(String[]args){
Scanner cs=new Scanner(System.in);
System.out.println("Input the temp. value in celcius=");
double celsius=cs.nextDouble();//taking input of temp. in celcius from user
double farenheitResult=((celsius * 9)/5) + 32;//converting the temp. from celcius to farenhite
System.out.println(" The "+celsius+" celsius is "+farenheitResult+" fahrenheit");
}
}