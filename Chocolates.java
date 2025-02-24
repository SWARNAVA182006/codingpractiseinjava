import java.util.*;
class Chocolates{
public static void main(String[]args){
Scanner ch=new Scanner(System.in);
System.out.println("Enter the total number of chocolates=");
int numberofchocolates=ch.nextInt();//input for toatl no. of chocolates
System.out.println("Enter the total number of children=");
int numberofchildren=ch.nextInt();//input for toatl no. of children
int div=numberofchocolates/numberofchildren;//distributing the chocolates evenly among students
int rem=numberofchocolates%numberofchildren;//remaining chocolatesafter distribution
System.out.println("The number of chocolates each child gets is "+div+" and the number of remaining chocolates are "+rem);
}}