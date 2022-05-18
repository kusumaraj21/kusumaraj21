package tns.com.lambdaexpression;

interface E
{
	int div(int a,int b);
}
public class Example5 {

	public static void main(String[] args) {
		//L.E. without return statement
		E object=(int a, int b)->(a/b);
		System.out.println("Division of a and b is " +object.div(5234,2));
		
		

	}

}