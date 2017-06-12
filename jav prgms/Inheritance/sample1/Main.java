abstract class Main {
	abstract void run();
}
class Honda4 extends Main {
	void run() { System.out.println("running safely");}
	
	public static void main(String[] args) {
		Main obj = new Honda4();
		obj.run();
	}
}