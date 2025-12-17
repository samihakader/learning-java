package apnaCollegeBasics;
import java.util.Scanner;
public class Methods {
	public static void printJava() {
		System.out.println("Hello Java");
	}
	public static void name(String name) {
		System.out.println(name);
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		printJava();
		System.out.println("Enter name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		name(name);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//int c=sum(a,b);
		System.out.println(sum(a,b));

	}

}
