
class Person {

	class Name {
		private String firstName;
		private String lastName;

		Name() {

			firstName = " ";
			lastName = " ";
		}
	}

	//private Name[] name;
	private int age;
	private String gender;
	int i = 0;
	int arrCount = 10;

  Person () {
	//this.name = null ;
	this.age = 0 ;
	this.gender = null ;
	}

void setAge(int age) { this.age = age;}

void addName(String fName, String lName) {
	if(i==0) { Name[] nameArr = new Name[arrCount]; }

	if(i==arrCount) { Name[] nameArr = new Name[i+arrCount]; }
	nameArr[i].firstName = fName;
	nameArr[i].lastName = lName;
	i++;
}
void setGender(String gender) { this.gender = gender;}

int getAge() { return age ;}
String getGender() { return gender;}
//String getName() { return name;}
// public String toString() {
// 	return ("Name: " + for(this.name + ", Age : " + this.age + ", Gender :" + this.gender);
// }
}

public class New4 
{
	public static void main(String[] args)
	{
		Person s = new Person();
		Name[] n =new Name[10];

		n[0].addName("Venki","Chotu");
		n[1].addName("ram","anant");
		s.setAge(23);
		s.setGender("M");
		for(int j=0;j<i;j++) {
			System.out.println(n[j].firstName);
			System.out.println(n[j].lastName);
		}
		
	}
}
