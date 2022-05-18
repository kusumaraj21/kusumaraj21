package tns.com.lambdaexpression;
//Lambda expression with two parameter
interface D
{
	int add(int a,int b);
}
public class Example3 {

	public static void main(String[] args) {
		
		D object=(int a, int b)->
		{
			return a+b;
		};System.out.println("The addition of a and b is " + object.add(25, 28));
		

	}

}
