package pack_capgemini;

class parent
{
	int a;
	void print(int a)
	{
		this.a=a;
	}
	void display()
	{
		System.out.println("The value of a is:" +a);
	}
}



public class Example1 {

	public static void main(String[] args) {
		parent p=new parent();
		p.print(12);
		p.display();
		
	}

}
