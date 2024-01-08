import java.util.*;
public class Prac106 {

	public static void main(String[] args) {
		
		//Checking leap year
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year");
		int year = sc.nextInt();
		
		if(year%400==0||year%4==0&&year%100!=0) {		//if divisible by 400==leap year
			System.out.println("Leap year");			//if divisible by 4 and not divisible by 100==leap year
	}
		else {
		System.out.println("Not a leap year"); 
		
	   }
	}
}
