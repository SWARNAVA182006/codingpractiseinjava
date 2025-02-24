import java.util.*;
class sum_while{
public static void main(String[]args){
	double sum=0;//initializing a variable called sum to calculate the total value
Scanner sm=new Scanner(System.in);

while(true){
System.out.println("Enter the numbers to be added(enter 0 to stop)=");//input for numbers to be added
double num=sm.nextDouble();
if(num==0){//if number given by user is 0 the loop will break
	break;
}else{
sum+=num;}//otherwise it will continue taking inputs and will add them one by one

}
System.out.println("Total value="+sum);//printing the final total value
}
}