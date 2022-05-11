package pack_capgemini;

public class Example3 
{
void accept(Example3 obj)
{
	System.out.println("Welcome");
}
void print()
{
	accept(this);
}
	public static void main(String[] args) {
		Example3 e=new Example3();
		e.print();

	}

}
