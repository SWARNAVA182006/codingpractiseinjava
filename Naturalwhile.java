import java.util.*;
class Naturalwhile{
public static void main(String[]args){
int sum=0;
int s=0;
Scanner nt=new Scanner(System.in);
System.out.println("Enter the number=");
int num=nt.nextInt();//taking input of number from the user
if(num>0){
s=num*(num+1)/2;
}//if it is natural(>0) sum value by formula
System.out.println("The summation value is- "+s);
int i=0;
while(i<=num){ //sum value by while loop
sum+=i;
i++;
}
System.out.println("The summation value is- "+sum);
if(sum==s){//checking whether the both answers are same for normal formula and while loop or not
	System.out.println("The summation values for both normal formula and while loop are matching.");
}else{
	System.out.println("The summation values for both normal formula and while loop are not matching.");
}
}
}