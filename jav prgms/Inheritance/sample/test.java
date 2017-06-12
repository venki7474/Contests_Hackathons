class BaseClass
{
   BaseClass() {
       System.out.println("BaseClass Constructor");
   }
   {
        System.out.println("Instance Block in baseClass");
   }
   static {
        System.out.println("Static Block in baseClass");
   } 
}
class DerivedClass extends BaseClass {
    DerivedClass() {
       System.out.println("DerivedClass Constructor");
   }
   {
        System.out.println("Instance Block in DerivedClass");
   }
   static {
        System.out.println("Static Block in DerivedClass");
   } 
}
public class test
{
    static {
        System.out.println("Static Block in test Class");
    }
    {
        System.out.println("instance Block in test Class");
    }
    public static void main( String[] args) {
        System.out.println("##############Inside Main: test Class");
        DerivedClass bc =new DerivedClass();
        System.out.println("End of Main");
    }
}