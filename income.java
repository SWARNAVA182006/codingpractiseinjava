import java.util.*;
class income{
public static void main(String[]args){
Scanner im=new Scanner(System.in);
System.out.println("Enter the salary amount:");
float salary=im.nextFloat();//taking input of salary amount from the user
System.out.println("Enter the bonus amount:");
float bonus=im.nextFloat();//taking input of bonus amount from the user
float total_income=bonus+salary;//calculating the income by adding salary and bonus
System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+total_income);
}}