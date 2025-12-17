package apnaCollegeBasics;

public class Casting {

	public static void main(String[] args) {
		//implicit
		double price = 100.00;
		double finalPrice = price + 18;
		System.out.println(finalPrice);
		//explicit
		int p = 100;
		int fp = p + (int)18.0;
		System.out.println(fp);
	}

}
