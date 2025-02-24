import java.util.*;
class square{
public static void main(String[]args){
Scanner sq=new Scanner(System.in);
System.out.println("Input the value of perimeter of the square=");
double perimeter=sq.nextDouble();//taking input of perimeter of the square
double side=perimeter/4;//calculating the side of the square
System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
}
}