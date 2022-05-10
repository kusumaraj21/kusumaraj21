package pack_capgemini;

public class Example_2 {
	String name;
	Example_2(String name)
	{
		this.name=name;
	}

	void display()
	{
		System.out.println("This is "+name);
	}
	public static void main(String[] args) {
		
Example_2 e1=new Example_2("Audi");
Example_2 e2=new Example_2("BMW");
Example_2 e3=new Example_2("TATA");
e1.display();
e2.display();
e3.display();
	}

}