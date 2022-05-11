package abstract_capgemini;

class Parent
{
	final void accept()
	{
		System.out.println("Parent");
	}
}
 class child
 {
	 void accept()
	 {
		 System.out.println("child");
	 }
 }

public class Example3 {

	public static void main(String[] args) {
	child c=new child();
	c.accept();

	}

}
