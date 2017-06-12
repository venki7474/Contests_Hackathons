interface Example1{
   public abstract void display1();
   public void display2();
}
class Example2 implements Example1{
   public void display1(){
      System.out.println("display1 method");
   }
   public void display2(){};
}
class Test{
   public static void main(String args[]){
      Example2 obj=new Example2();
      obj.display1();
   }
}