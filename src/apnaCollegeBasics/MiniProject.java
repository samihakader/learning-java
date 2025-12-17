//Guess the number game
package apnaCollegeBasics;
import java.util.Scanner;
public class MiniProject {

	public static void main(String[] args) {
		int myNumber=(int)(Math.random()*100);
		int userNumber;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Guess any number");
			userNumber=sc.nextInt();
			if(userNumber == myNumber) {
				System.out.println("Congratulations");
				break;
			}
			else if(userNumber > myNumber) {
				System.out.println("Number is too large");
			}
			else {
				System.out.println("Number is too small");
			}
		}while(userNumber>=0);
		System.out.println("My number was "+ myNumber);
	}
	
}
