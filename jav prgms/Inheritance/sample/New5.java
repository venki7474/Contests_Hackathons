
class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String[] nameArr = new String[10];
	int i =0;
  Person () {
	this.firstName = "";
	this.lastName = "";
	this.age = 0;
	this.gender = "";
	}
	
void setAge(int age) { this.age = age;}

void addName(String fName,String lName) { 
	firstName = fName;
	lastName = lName;
	nameArr[i] = firstName+lastName;
	i++;
	 
}
void setSortList() {
	for(int k=0; k<i; k++)
}
String[] getSortList() {
	return nameArr;
}
int getAge() { return age ;}
void setGender(String gender) { this.gender = gender;}
String getGender() { return gender;}
//String getName() { return name;}
public String toString() {
	return ("fName: " + firstName + " lName :" + lastName + ", Age : " + this.age + ", Gender :" + this.gender);
}
}

public class New5 
{
	public static void main(String[] args)
	{
		
		Person s = new Person();

		s.addName("venki", " chotu");
		s.addName("raj","abc");
		String[] x = s.getSortList();
		for(int j=0;j<2 ;j++) {
		System.out.println(x[j]);
	}
	}
}

