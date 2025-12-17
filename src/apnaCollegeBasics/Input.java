package apnaCollegeBasics;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ,nickname age and weight");
		String name=sc.nextLine();
		String nickname = sc.next();
		int age = sc.nextInt();
		float weight = sc.nextFloat();
		System.out.println(name +" "+nickname+" "+ age +" "+weight);
	}

}
