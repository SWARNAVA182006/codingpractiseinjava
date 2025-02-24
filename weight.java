import java.util.*;
class weight{
public static void main(String[]args){
Scanner wt=new Scanner(System.in);
System.out.println("Enter weight in kg=");
double kg=wt.nextDouble();//input for weight in kg

double wt_pounds=kg/2.2;//calculate weight in pounds
System.out.println(" The weight of the person in pounds "+wt_pounds+" and in kg is "+kg);
}
}