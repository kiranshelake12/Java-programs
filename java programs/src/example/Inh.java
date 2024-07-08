package example;




class A {
	void add()
	{
	System.out.println("calling a");
}
}
	
class B extends A {
	void sub ()
	{
	System.out.println("calling b");
	}
}
	class C extends B {
		void div()
		{
			System.out.println("calling c");
		}
	}

public class Inh {
	public static void main (String []args)
	{
		C c   = new C();
		c.add();
		c.sub();
		c.div();
	}
}




