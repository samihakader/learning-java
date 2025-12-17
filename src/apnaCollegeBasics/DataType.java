package apnaCollegeBasics;

public class DataType {

	public static void main(String[] args) {
	//primitive type	
		//length fixed
		// byte - 1[-128 to 127]
		//short-2
		//int-4
		//long-8
		//float-4
		//double-8
		//char-2
		//boolean-1
		byte age = 30;
		int phone = 1234567890;
		long phone2 = 12345678900L;//L needed to tell the compiler it is a long
		float pi = 3.14F;
		char letter = 'a';
		boolean isAdult = age>17;
		System.out.println(isAdult);
	//non primitive type
		//they have their own methods
		//no fixed length
		String name = "Samiha";
		//needs to be declared with new keyword
		String friend = new String("Sovon");
		System.out.println(friend);
		System.out.println(name.length());
	}

}
