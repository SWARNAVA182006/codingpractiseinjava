import java.util.*;
class factorial{
public static void main(String[]args){
Scanner fl=new Scanner(System.in);
System.out.println("Input an integer number=");
int num=fl.nextInt();//taking input of number from the user
if(num>0){//if number is natural(>0) it will calculate the factorial value otherwise not
int i=1;
int fact=1;
while(num>=i){//calculation of factorial value using while loop
fact*=num;
num--;
}
System.out.println("The factorial value is="+fact);
}
else{
System.out.println("Sorry!inavalid input.");}
}
}