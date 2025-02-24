import java.util.*;
class smallest{
public static void main(String[] args){
Scanner sm=new Scanner(System.in);
System.out.println("Enter the first number=");
float a=sm.nextFloat();//input for num1
System.out.println("Enter the second number=");
float b=sm.nextFloat();//input for num2
System.out.println("Enter the third number=");
float c=sm.nextFloat();//input for num3
if(a<b&&a<c){
System.out.println("Yes "+a+" is the smallest number.");
}else{
System.out.println("No "+a+" is not the smallest number.");//finding if the first number is the smallest one or not
}
}}