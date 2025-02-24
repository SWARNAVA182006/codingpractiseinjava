import java.util.*;
class doubleoperation{
public static void main(String[] args){
Scanner it=new Scanner(System.in);
System.out.println("Input the double a value=");
double a=it.nextDouble();//taking input for a
System.out.println("Input the double b value=");
double b=it.nextDouble();//taking input for b
System.out.println("Input the double c value=");
double c=it.nextDouble();//taking input for c
double op1=a + b *c;//operation 1 calculation
double op2=a * b + c;//operation 2 calculation
double op3= c + a / b;//operation 3 calculation
double op4=a % b + c;//operation 4 calculation
System.out.println("The results of Double Operations are "+op1+","+op2+","+op3+" and "+op4);
}}