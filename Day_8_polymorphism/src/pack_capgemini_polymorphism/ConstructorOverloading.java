package pack_capgemini_polymorphism;

class A
{
	String color;
	int speed;
	A()
	{
		System.out.println("hii");
	
	}
	A(String clr,int s)
	{
		color=clr;
		speed=s;
		System.out.println("Color is "+clr+" "+"speed is "+s+"km/hr");
	}
}



public class ConstructorOverloading {

	public static void main(String[] args) {
	new A();
	new A("Red",50);

	}

}
