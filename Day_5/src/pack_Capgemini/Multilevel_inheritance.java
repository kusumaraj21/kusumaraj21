package pack_Capgemini;

class samsung{
	void accept()
	{
		System.out.println("Samsung Galaxy");
	}
}
class samsung1 extends samsung
{
	void print()
	{
		System.out.println("Samsung Galaxy1");
	}
}

class samsung12 extends samsung1
{
	void display()
	{
		System.out.println("Samsung Galaxy12");
	}
}



public class Multilevel_inheritance {

	public static void main(String[] args) {
		
		samsung12 obj=new samsung12();
		obj.display();
		obj.print();
		obj.accept();
	}

}
