
class Person {
	private String name;
	private int age;
	private String gender;
	private boolean a = false;
  Person () {
	this.name = "";
	this.age = 0;
	this.gender = "";
	}
void setAge(int age) { this.age = age;}
void setName(String name) { this.name = name;}
int getAge() { return age ;}
void setGender(String gender) { this.gender = gender;}
String getGender() { return gender;}
String getName() { return name;}
boolean getReducedFare() {
	if ((age <=12) || (age>=64)) {
		boolean a=true;
		return a;
	}
	return a;
}
public String toString() {
	return ("Name: " + this.name + ", Age : " + this.age + ", Gender :" + this.gender);
}
}
class Student extends Person {
	private String college;
	private double gpa;
	private String year;
	
	Student () {
		 super();
		this.college = "";
		this.gpa = 0;
		this.year = "";
	}
	void setCollege(String college) {
		this.college = college;
	}
	void setGpa(double gpa) {
		this.gpa = gpa;
	}
	void setYear(String year) {
		this.year = year;
	}
	String getCollege() {
		return college;
	}
	double getGpa() {
		return gpa;
	}
	String getYear() {
		return year;
	}

	public String toString() {
		return ( super.toString()+"\n " + "College :" + college + " Gpa :" + gpa + " Year :" + year);
	}
}
public class New3 
{
	public static void main(String[] args)
	{
		// Person p =new Person();
		Student s = new Student();

		s.setName("venki");
		s.setAge(65);
		s.setGender("M");

		s.setCollege("JBIET");
		s.setGpa(3.5);
		s.setYear("sophomore");
		boolean b = s.getReducedFare();
		System.out.println(s);
		System.out.println("Status of reduced Fare is:" + b);
	}

}

