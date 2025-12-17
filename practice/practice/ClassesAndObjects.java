package practice;
class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing something");
	}
	public void printColor() {
		System.out.println(this.color);
	}
}
class Student{
	String name;
	int age;
	public void printInfo() {
		System.out.println(this.name + " " + this.age);
	}
}

public class ClassesAndObjects {

	public static void main(String[] args) {
//		Pen pen1 = new Pen();
//		pen1.color = "Blue";
//		pen1.type = "Gel";
//		pen1.write();
//		pen1.printColor();
//		
//		
//		Pen pen2 = new Pen();
//		pen2.color = "Black";
//		pen2.type = "Ballpoint";
//		pen2.printColor();

		Student s1 = new Student ();
		s1.name = "Shradha";
		s1.age = 22;
		s1.printInfo();
}

}
