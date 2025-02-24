import java.util.*;
class pnz{
public static void main(String[]args){
Scanner pz=new Scanner(System.in);
System.out.println("Enter a number=");
float number=pz.nextFloat();//input for a number
if(number>0){
System.out.println(number+" is a positive number.");}//checking if number>0
else if(number==0){
System.out.println("It is zero.");}//checking if number=0
else{
System.out.println(number+" is a negative number.");//checking if number<0
}
}}