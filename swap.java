import java.util.*;
class swap{
public static void main(String[]args){
Scanner sw=new Scanner(System.in);
System.out.println("Input the first number:");
float number1=sw.nextFloat();//input of num1 from user
System.out.println("Input the second number:");
float number2=sw.nextFloat();//input of num2 from user
float s;//taking a third variable
s=number1;
number1=number2;//swapping the numbers using this third variable
number2=s;
System.out.println("The swapped numbers are "+number1+" and "+number2);
}
}