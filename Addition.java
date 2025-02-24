import java.util.*;
public class Addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int number1 = sc.nextInt();
		System.out.println("Enter second number");
		int number2 = sc.nextInt();
		int add = number1+number2;
		System.out.println(add);
	}
}