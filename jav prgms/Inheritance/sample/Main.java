
class Person {
	static enum Gender { M, F }
	private String name;
	private int age;
	private Gender gender;
  Person (String name ,int age,String gender) {
	this.name = name;
	this.age = age;
	this.gender = Gender.valueOf(gender);
	}
void setAge(int age) { this.age = age;}
//void setGender(Gender gender) { this.gender = gender;}
void setName(String name) { this.name = name;}
int getAge() { return age ;}
Gender getGender() { return gender;}
String getName() { return name;}
public String toString() {
	return ("Name: " + name + ", Age : " + age + ", Gender" + gender);
}
}
// class Student extends Person {
// 	private String college;
// 	private double gpa;
// 	static enum YearInSchool {frosh, sophmore, junior, senior}
// 	private YearInSchool year;
// 	Student () {
// 		this.college = " ";
// 		this.gpa = 0;
// 		this.year =;
// 	}
// 	void setCollege(String college) {
// 		this.college = college;
// 	}
// 	void setGpa(double gpa) {
// 		this.gpa = gpa;
// 	}
// 	void setYear(YearInSchool year) {
// 		this.year = year;
// 	}
// 	String getCollege() {
// 		return college;
// 	}
// 	double getGpa() {
// 		return gpa;
// 	}
// 	YearInSchool getYear() {
// 		return year;
// 	}

// 	public String toString() {
// 		return (super.toString() + "\n " + "College :" + college + " Gpa :" + gpa + " Year :" + year);
// 	}
// }
public class Main 
{
	public static void main(String[] args)
	{
		Person p =new Person("venki",23,"M");
		System.out.println(p);
	}

}