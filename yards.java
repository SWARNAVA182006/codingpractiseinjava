import java.util.*;
class yards{
public static void main(String[]args){
Scanner yd=new Scanner(System.in);
System.out.println("Enter distance in feet=");
float dis_feet=yd.nextFloat();//input for distance in feet
float dis_yard=dis_feet/3;//converting dist to yards
float dis_mile=(int)dis_yard/1760;//now converting to miles
dis_yard=dis_yard%1760;//updating yards value
System.out.println("Distance in feet given by the user is "+dis_feet+", so it is "+dis_mile+" miles and "+dis_yard+" yards");
}}