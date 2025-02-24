import java.util.*;
class athlete{
public static void main(String[]args){
Scanner tr=new Scanner(System.in);
System.out.println("Enter the dist. of side1 of the triangular park in meters=");
double side1=tr.nextDouble();//side1 dist. in meter
System.out.println("Enter the dist. of side2 of the triangular park in meters=");
double side2=tr.nextDouble();//side2 dist. in meter
System.out.println("Enter the dist. of side3 of the triangular park in meters=");
double side3=tr.nextDouble();//side3 dist. in meter
double perimeter=(side1+side2+side3)/1000;//perimeter in km.
double rounds=5.0/perimeter;//calculating no. of rounds required to complete 5 km. distance
System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
}}