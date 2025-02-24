import java.util.*;
class sum{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Input the first number=");
float num1=s.nextFloat();//taking input of number 1
System.out.println("Input the second number=");
float num2=s.nextFloat();//taking input of number 2
float add=num1+num2;//calculating the addition value
float sub=num1-num2;//calculating the subtraction value
float mult=num1*num2;//calculating the multiplication value
float div=num1/num2;//calculating the division value
System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+ num2 + " is "+ add +","+ sub +","+ mult +" and "+ div);
}}