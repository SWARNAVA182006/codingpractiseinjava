import java.util.*;
class feeswithinput{
	public static void main(String[]args){
		Scanner fees=new Scanner(System.in); //for taking input
	System.out.println("Enter the college fees=");
	double college_fees=fees.nextDouble();//input for college fees
	System.out.println("Enter the discount percentage=");
	double discount=fees.nextDouble();//input for discount percentage
	double discount_amount=(college_fees*discount)/100;//calculating discounted amount
	double final_amount=college_fees-discount_amount;//final amount to be paid after discount
	System.out.println("The discount amount is INR "+discount_amount+"and final discounted fee is INR"+final_amount);
	}
}