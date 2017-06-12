class A  {
  int var;
  public A() {
		System.out.println("Constructor class A");
		A obj2 = new A(150);//class A's parameterized constructor will invoked
  }
	
 	public A(int i) {
 		var  = i;
 		System.out.println(var +" A");
 		//A obj3 = new A();//class A's non parameterized constructor will invoked
 }
}

class B extends A {
  int var2 = 20;
  public B() {
  	super();// Cladd B's super class constructor will invoked
  	System.out.println("Constructor class B");
  }	

  public B(int k) {
     super(k);
     var2 = k;
     System.out.println("   "+var2);

  }
}

class Test1 {
	public static void main(String[] args) {
		B obj = new B(); // Class B constructor will invoked
		B obj1 = new B(200);// class B's parameterized constructor will invoked
		// obj1 never invoked due to infinite constructor call	
	}
}