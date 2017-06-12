
class Person {
	private String name;
	private int age;
	private String gender;
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
class GradStudent extends Student {
	private String department;
	private String thesis;

	GradStudent() {
		super();
		department = " ";
		thesis = " ";
	}

	void setDepartment(String department) { this.department = department;}
	void setThesis(String thesis) { this.thesis = thesis;}
	String getDepartment() { return department;}
	String getThesis() { return thesis;}
	public String toString() {
		return(super.toString() + "\n"+ "Department :" +department + " Thesis :" +thesis);
	}
}
public class New2
{
	public static void main(String[] args)
	{
		// Person p =new Person();
		GradStudent s = new GradStudent();

		s.setName("venki");
		s.setAge(23);
		s.setGender("M");

		s.setCollege("JBIET");
		s.setGpa(3.5);
		s.setDepartment("ECE");
		s.setThesis("Embedded Systems");

		//System.out.println(p);
		System.out.println(s);
	}

}


