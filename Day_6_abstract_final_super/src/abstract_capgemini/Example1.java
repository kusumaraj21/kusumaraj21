package abstract_capgemini;

abstract class A
{
	abstract void print();
	
}

class B extends A
{
	void print()
	{
		System.out.println("Welcome");
	}
}
public class Example1 {

	public static void main(String[] args) {
		
	A obj=new B();
	obj.print();

	}

}

