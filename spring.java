import java.util.*;
class spring{
public static void main(String[]args){
Scanner sp=new Scanner(System.in);
System.out.println("Enter the month name:");
String month=sp.nextLine();//input for monyh name using String -[sp.nextLine()]
System.out.println("Enter the date:");
int day=sp.nextInt();//Input for date
if(month.equals("March")&&day>=20&&day<=31){
	System.out.println(day+" of "+month+" is under Spring season");
}else if(month.equals("April")&&day>=1&&day<=30){
	System.out.println(day+" of "+month+" is under Spring season");
}else if(month.equals("May")&&day>=1&&day<=31){
	System.out.println(day+" of "+month+" is under Spring season");//Multiple conditions using if-else
}else if(month.equals("June")&&day>=1&&day<=20){
	System.out.println(day+" of "+month+" is under Spring season");
}else{
	System.out.println(day+" of "+month+" is not under Spring season");
}
}
}