package tns.com.multitrading;

class A extends Thread
{
	public void run()
	{
		try {
			Thread.sleep(10000);
			System.out.println("C2TC Program");
		} catch (InterruptedException e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		A obj=new A();
		obj.start();
		obj.interrupt();
		
	}

}