package apnaCollegeBasics;

public class ExceptonHandling {

	public static void main(String[] args) {
		//although errors cannot be handled,exception can be
		int[] marks = {97,98,95};
		//System.out.println(marks[5]);
		try {//something that might generate errors is written here
			System.out.println(marks[5]);
		}
		catch(Exception exception) {
			
		}
		System.out.println(" The student name is Samiha");
	}

}
