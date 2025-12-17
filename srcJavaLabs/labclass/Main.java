package labclass;

public class Main {

	public static void main(String[] args) {
		String name="Samiha";
			System.out.println("Length:" +name.length());
		int count=0;
		System.out.print("Character is found at: ");
		for(int i=0;i<name.length();i++) {
			if(Character.toLowerCase(name.charAt(i))=='a') {
				System.out.print(i+" ");
				count++;
			}
		}
		if(count>0) {
			System.out.println("\nYes. 'a' occurs " +count+" times");
		}
		else {
			System.out.println("\n'a' is not in the string");
		}

	}

}
