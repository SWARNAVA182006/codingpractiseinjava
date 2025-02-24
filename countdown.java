import java.util.*;
class countdown{
public static void main(String[]args){
Scanner cd=new Scanner(System.in);
System.out.println("Enter the number from which you want to start the countdown=");
int num=cd.nextInt();//input of  number for the countdown
System.out.println("And the countdown begins!-");
while(num!=0){
System.out.println(num);//countdown continues from the given number till 1 using while loop
num--;
}
System.out.println("****And the rocket launched****");
}
}