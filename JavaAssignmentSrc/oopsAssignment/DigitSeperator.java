package oopsAssignment;
import java.util.Scanner;

public class DigitSeperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<10000 || num>99999) {
			System.out.println("Wrong input");
			return;
		}
		int dig = 10000;
		for(int i=0;i<5;i++) {
			System.out.print(num/dig+" ");
			num%=dig;
			dig/=10;
		}

	}

}
