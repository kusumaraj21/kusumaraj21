package abstract_capgemini;

class fruit
{
	String name="Banana";
}
class Apple extends fruit
{
	String name="Apple-1";
	void print()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}



public class Example5 {

	public static void main(String[] args) {
		Apple a=new Apple();
		a.print();

	}

}
