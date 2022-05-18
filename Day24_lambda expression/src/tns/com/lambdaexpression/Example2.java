package tns.com.lambdaexpression;

//Lambda Expression with single parameter
interface C
{
	String display(String str);
}
public class Example2 {

	public static void main(String[] args) {
		
		C object=(String str)->
		{
			
			return str;
		};
		System.out.println(object.display("Lambda Expression with Single Parameter"));

	}

}