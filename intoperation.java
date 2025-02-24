import java.util.*;
class intoperation{
public static void main(String[] args){
Scanner it=new Scanner(System.in);
System.out.println("Input the int a value=");
int a=it.nextInt();//taking input for a
System.out.println("Input the int b value=");
int b=it.nextInt();//taking input for b
System.out.println("Input the int c value=");
int c=it.nextInt();//taking input for c
int op1=a + b *c;//operation 1 calculation
int op2=a * b + c;//operation 2 calculation
int op3= c + a / b;//operation 3 calculation
int op4=a % b + c;//operation 4 calculation
System.out.println("The results of Int Operations are "+op1+","+op2+","+op3+" and "+op4);
}}