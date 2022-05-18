package tns.com.lambdaexpression;

//Lambda Expression-To reduce the line of codes
interface A
{
	void show(); //Functional interface which contain only one abstract method
	
}
/*class B implements A
{
	public void show()
	{
		System.out.println("Functional Interface");
	}
}*/
public class Example1 {

	public static void main(String[] args) {
		//Lambda expression with no parameter
		A obj =()-> //syntax of L.E.
		{
			System.out.println("Functional Interface");
		};
		obj.show();

	}

}