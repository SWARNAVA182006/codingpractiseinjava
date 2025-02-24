class fees{
public static void main(String[] args){
float college_fees=125000;// putting college fees amount
float discount=10;// discount percentage
float discount_amount=(college_fees*discount)/100;//calculating the discount amount
float final_amount=college_fees-discount_amount;//calculating the final price after discount
System.out.println("The discount amount is INR "+discount_amount+" and final discounted fee is INR"+final_amount);
}
}