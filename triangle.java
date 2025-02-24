import java.util.*;
class triangle{
public static void main(String[]args){
Scanner tr=new Scanner(System.in);
System.out.println("Input the value of base of the triangle=");
double base=tr.nextDouble();//taking input of base value of the triangle
System.out.println("Input the value of height of the triangle=");
double height=tr.nextDouble();//taking input of height value of the triangle
double area=(0.5*base*height);//calculating area of the triangle
System.out.println("The area of the triangle= "+ area +" where base is "+base+" and height is "+height);
}
}