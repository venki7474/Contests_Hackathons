class Base{
	int value = 0;
        Base(){
        	addValue();
        	System.out.println("base const ");
        }
        void addValue(){
        	value += 10;
        }
        void getValue(){
        	System.out.println("in get ");
        }
}
class Derived extends Base{
	Derived(){
		// addValue();
		System.out.println("derived const");
	}
	void addValue(){
		value +=  20;
	}
	void getValue(){
        	// System.out.println("in get der");
        	// return value;
        int x = 3;
        if(1+1+1 == x) {
            System.out.println("yes");
        } else{
            System.out.println("No");
        }
    }
}
public class Test{
	public static void main(String[] args){
		Derived b = new Derived();
		// System.out.println(
        b.getValue();
	}
}