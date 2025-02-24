import java.util.*;
class fromviato{
public static void main(String[]args){
Scanner fvt=new Scanner(System.in);
System.out.println("Input the dist. for fromcity in miles=");
float fromcity=fvt.nextFloat();//input for fromcity dist. in miles
System.out.println("Input the dist. for viacity in miles=");
float viacity=fvt.nextFloat();//input for viacity dist. in miles
System.out.println("Input the dist. for tocity in miles=");
float tocity=fvt.nextFloat();//input for tocity dist. in miles
float fromToVia=viacity-fromcity;//calculating the dist. between from and via
float viaToFinalCity=tocity-viacity;//calculating the dist. between to and via
System.out.println("The distence for fromToVia is "+fromToVia+" miles and viaToFinalCityis "+viaToFinalCity+" miles");
}}