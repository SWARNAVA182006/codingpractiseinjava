import java.util.*;
class divisible{
public static void main(String[]args){
Scanner dv=new Scanner(System.in);
System.out.println("Enter a number-");//input for a number
float num=dv.nextFloat();
if(num%5==0){
System.out.println("Yes, "+num+" is divisible by 5");}//checking whwther the number is divisible by 5 or not
else{
System.out.println("No, "+num+" is not divisible by 5");}
}
}