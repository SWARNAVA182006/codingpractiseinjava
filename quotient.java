import java.util.*;
class quotient{
public static void main(String[]args){
Scanner qt=new Scanner(System.in);
System.out.println("Enter the first number=");
double num1=qt.nextDouble();//input for num1
System.out.println("Enter the second number=");
double num2=qt.nextDouble();//input for num2
double remainder=num1%num2;//calculating the remainder
double quotient=num1/num2;//calculating the quotient
System.out.println(" The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+num1+" and "+num2);
}}