import java.util.*;
class farenhite{
public static void main(String[]args){
Scanner ft=new Scanner(System.in);
System.out.println("Input the temp. value in farenhite=");
double f=ft.nextDouble();//taking input of temp. in farenhite from user
double celsius= (((f - 32) * 5)/9);//converting the temp. from celcius to farenhite
System.out.println(" The "+f+" farenhite is "+celsius+" celsius");
}
}