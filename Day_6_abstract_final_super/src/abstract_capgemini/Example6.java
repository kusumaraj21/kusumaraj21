package abstract_capgemini;

class Parent3
{
	void accept()
	{
		System.out.println("Parent-3");
	}
}

class child3 extends Parent3
{
	 void accept()
	 {
		 System.out.println("child-3");
	 }
	 void display()
	 {
		 accept();
		 super.accept();
	 }
}


public class Example6 {

	public static void main(String[] args) {
		child3 c=new child3();
		c.display();

	}

}
