package tns.com.annotation;

class Animal
{
	@Deprecated
	void sound()
	{
		System.out.println("Roar");
	}
	void print()
	{
		System.out.println("animal sound");
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.print();
		
	}

}