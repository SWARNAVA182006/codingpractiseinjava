import java.util.*;
class check{
public static void main(String[]args){
Scanner ch=new Scanner(System.in);
System.out.println("Enter the first number=");
double num1=ch.nextDouble();//input for num1
System.out.println("Enter the second number=");
double num2=ch.nextDouble();//input for num2
System.out.println("Enter the third number=");
double num3=ch.nextDouble();//inut for num3
if(num1>num2&&num1>num3){
System.out.println(num1+" is the largest number.");}
else if(num2>num1&&num2>num3){
System.out.println(num2+" is the largest number.");}//finding the largest number among 3 using if-else
else{
System.out.println(num3+" is the largest number.");}
}
}