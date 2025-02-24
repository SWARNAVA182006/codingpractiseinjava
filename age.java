import java.util.*;
class age{
public static void main(String[]args){
Scanner ag=new Scanner(System.in);
System.out.println("Enter the age=");//input for age
int age=ag.nextInt();
if(age>=18){
System.out.println("The person's age is "+age+" and can vote.");}
else{
System.out.println("The person's age is "+age+" and cannot vote.");}//checking age criteria for votting using if-else
}}