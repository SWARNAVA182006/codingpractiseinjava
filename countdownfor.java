import java.util.*;
class countdownfor{
public static void main(String[]args){
Scanner cd=new Scanner(System.in);
System.out.println("Enter the number from which you want to start the countdown=");
int num=cd.nextInt();//input of  number for the countdown
System.out.println("And the countdown begins!-");
for(int i=num;i>=1;i--){
System.out.println(i);//countdown continues from the given number till 1 using for loop
}
System.out.println("****And the rocket launched****");
}
}