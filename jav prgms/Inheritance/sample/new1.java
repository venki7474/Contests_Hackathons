
class Person {
	private String name;
	private int age;
	private String gender;
  Person () {
	name = "";
	age = 0;
	gender = "";
	}
void setAge(int age) { this.age = age;}
void setName(String name) { this.name = name;}
int getAge() { return age ;}
void setGender(String gender) { this.gender = gender;}
String getGender() { return gender;}
String getName() { return name;}
public String toString() {
	return ("Name: " + name + ", Age : " + age + ", Gender :" + gender);
}
}
class Employee extends Person {
	private String company;
	private int salary;
	
	Employee() {
		super();
		company = " ";
		salary = 0;
	}
 void setSalary(int salary) {this.salary = salary; }
 void setCompany(String company) { this.company = company;}
 String getCompany() { return company;}
 int getSalary() { return salary;}
 public String toString() {
 	return (super.toString() + " Company :" +company + " Salary :" +salary);
 }

}
public class New1 
{
	public static void main(String[] args)
	{
		// Person p =new Person();
		Employee e = new Employee();

		e.setName("venki");
		e.setAge(23);
		e.setGender("M");

		e.setCompany("Google");
		e.setSalary(1000);

		//System.out.println(p);
		System.out.println(e);
	}

}

