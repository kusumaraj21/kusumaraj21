package pack_capgemini;

public class Example3 {
	String name;
	Example3(String name)
	{
		this.name=name;
	}
	void output()
	{
		System.out.println("This is "+name);
	}

	public static void main(String[] args) {
		Example3 e1=new Example3("Rose");
		Example3 e2=new Example3("Lily");
		e1.output();
		e2.output();
}
}
