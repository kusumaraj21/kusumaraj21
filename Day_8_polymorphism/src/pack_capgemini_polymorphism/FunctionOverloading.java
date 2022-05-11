package pack_capgemini_polymorphism;

class Rectangle
{
	void print(int a,int b)
	{
		System.out.println(a*b);
	}
	void print(float a,float b)
	{
		System.out.println(a*b);	
	}
	void print(int l,int a,int b)
	{
		System.out.println(l*a*b);
	}
}




public class FunctionOverloading {

	public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.print(10,20);
	r.print(12.2f,13.4f);
	r.print(10,21,23);
			
		
			

	}

}