import java.util.*;
class Naturalfor{
public static void main(String[]args){
int sum=0;
int s=0;
Scanner nt=new Scanner(System.in);
System.out.println("Enter the number=");
int num=nt.nextInt();//taking input of number from the user
if(num>0){
s=num*(num+1)/2;//if it is natural(>0) sum value by formula
}
System.out.println("The summation value is= "+s);
for(int i=1;i<=num;i++){ //sum value by for loop
sum+=i;
}
System.out.println("The total value using for loop="+sum);

if(sum==s){//checking whether the both answers are same for normal formula and for loop or not
	System.out.println("Both the summation values by normal formula and for loop are mathching.");
}
else{
System.out.println("Both the summation values by normal formula and for loop are not mathching.");}
}}