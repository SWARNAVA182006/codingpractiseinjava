import java.util.*;
class shopping{
public static void main(String[]args){
Scanner sp=new Scanner(System.in);
System.out.println("Enter the quantity of the product=");
float quantity=sp.nextFloat();//input for quantity of the product
System.out.println("Enter the amount of the product=");
float amount=sp.nextFloat();//input for amount of the product
float bill=amount*quantity;//total bill amount calculation
System.out.println("The total purchase price is INR "+bill+" if the quantity "+quantity+" and unit price is INR "+amount);
}}