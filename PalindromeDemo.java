package labprograms;
import java.util.Scanner;
public class PalindromeDemo {

	public static void main(String[] args) {
		//check number is palindrome or not
		
		int rem,originalNum,reverseNum=0;
//		creating object to Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		 originalNum =number;
		while(number!=0) {
			rem=number%10;
			reverseNum=(reverseNum*10)+rem;
			number=number/10;
		}
		
		if(reverseNum == originalNum) {
			System.out.println("Number is Palindrome");
			
		}
		else {
			System.out.println("Number is not a Palindrome");
		}

	}

}