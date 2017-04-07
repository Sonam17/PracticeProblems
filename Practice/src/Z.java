
public class Z
{
   public static void main (String args []) {
       X obj1 = new X(); // Reference and object X
       X obj2 = new Y(); // X reference but Y object
       Y obj3 = new Y();
       
       obj1.methodA();
       obj2.methodA();
       obj3.methodB();
       
       
   }
}

 class X
{
    public void methodA() //Base class method
    {
        System.out.println ("hello, I'm methodA of class X");
    }
}

 class Y extends X
{
    public void methodA() //Derived Class method
    {
        System.out.println ("hello, I'm methodA of class Y");
    }
    
    public void methodB() //Derived Class method
    {
        System.out.println ("hello, I'm methodB of class Y");
    }
}