package apnaCollegeBasics;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//when contents of array are known
		int[] marks = {97,98,95};
		//int[] marks = new int[3];//array is non premitive. so new
//		marks[0]=97;
//		marks[1]=98;
//		marks[2]=95;
//		//unless initialized with a value, Java by default initializes with 0 for int false for boolean
		System.out.println(marks[0]);
		//length
		System.out.println(marks.length);//not a member
		//sort
		Arrays.sort(marks);
		System.out.println(marks[0]);
		//2D arrays
		int[][] finalMarks = {{97,98,95},{95,95,98}};
		System.out.println(finalMarks[0][0]);
		
	}

}
