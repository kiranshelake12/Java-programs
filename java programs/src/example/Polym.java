package example;


	
	class X {
		void add() {
			
		System.out.println("add");
		}
		}
	
	class Y extends X{
	void sub() {
		
		System.out.println("sub");
		}
		}
	
	class Z extends X {
	void div() {
		System.out.println("div");
			}
			}
	
	public class Polym {
		public static void main (String [] args)
		{
			Z x = new Z();
			Y a = new Y();
			x.add();
	        a.sub();
			x.div();

	
	
	}

}
