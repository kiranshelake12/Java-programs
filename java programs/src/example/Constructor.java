package example;

 class Student{
	int id;
	int rollno;
	String name;
	
	
	//constructor
	Student(int id ,int rollno,String name)
	{
		this.id=id;
		this.rollno=rollno;
		this.name=name;
		
}
	 void display()
	{
		System.out.println("id is " + id + " " + "Roll no is " + rollno + " " +  "name is" +  " " +name);
	}
	
	
	public class Constructor{
		public static void main (String []args)
		{
			Student s1 = new Student(12,123,"krn" );
			Student s2 = new Student(23,456,"hi");
				
			s1.display();
			s2.display();
			
			
		}
	}

	
}
