import java.util.*;
class natural{
public static void main(String[]args){
Scanner nt=new Scanner(System.in);
System.out.println("Enter a number=");
int n=nt.nextInt();//input for a number
int sum=n * (n+1) / 2;//calculating sum 
if(sum>=0){
System.out.println("The sum of "+n+" natural numbers is "+sum);}

else{
System.out.println("The number "+n+" is not a natural number");}}//checking whether sum>=0 or sum<0
}