package tns.com.capgemini;

public class Example1
{
	enum Margin
		{
			TOP,BOTTOM,LEFT,RIGHT;
		}
	
	
	public static void main(String[] args) {
		int count=1;
		for(Margin m:Margin.values())
		{
			System.out.printf("Margin:%d =%s\n",count++,m);
		}

	}

}
