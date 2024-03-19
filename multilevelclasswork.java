package OOPS;
class parent {
	void set()
	{
		System.out.println("This is first subclass");
	}
	
}
class son extends parent{
	void put()
	{
		System.out.println("This is second subclass");
	}
}

public class multilevelclasswork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		son s1=new son();
		s1.set();
		s1.put();

	}

}
