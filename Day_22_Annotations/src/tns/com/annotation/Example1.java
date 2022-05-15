package tns.com.annotation;

class A
{
	
	
	void display()
	{
		System.out.println("Hello World");
	}

}
class B extends A
{
	@Override
	void display()
	{
		System.out.println("Parent class");
	}
}
public class Example1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.display();

	}
}
