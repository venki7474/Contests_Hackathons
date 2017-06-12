interface Purna {
	abstract void eatingFood(); 
	abstract  String watchMovie();
	public void display(); 
	// 	System.out.println("Display");
	
}
 abstract class Venki implements Purna {
	public void eatingFood() {
	}
} 
class Raj extends Venki {
	public String watchMovie() {
		return "kick2";


	}
	public void display() {
		System.out.println("Display");
	}
}
public class Testabs {
	public static void main(String[] args) {
	Purna v =new Raj();
	v.display();
	v.eatingFood();

	System.out.println(v.watchMovie());
	}
}