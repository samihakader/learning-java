package apnaCollegeBasics;

public class Strings {

	public static void main(String[] args) {
		// concatenate
		String name = "Samiha";
		String name2 = "Kader";
		String name3 = name +" " + name2;
		System.out.println(name3);
		//charAt-which character is t certain position
		System.out.println(name.charAt(0));
		//length
		System.out.println(name.length());
		//replace-replaces a character with another one but does not change in the original string
		String name4 = name.replace('a','b');
		System.out.println(name4);
		//substring
		System.out.println(name.substring(0,3));// for i to jth position range will be i,j+1
	}

}
