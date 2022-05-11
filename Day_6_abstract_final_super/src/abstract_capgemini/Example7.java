package abstract_capgemini;
class parent4
{
	parent4()
	{
		System.out.println("Parent-4");
	}
}

class child4 extends parent4
{
	 child4()
	 {
		 super();
		 System.out.println("child-4");
	 }
}




public class Example7 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		child4 c=new child4();

	}

}


