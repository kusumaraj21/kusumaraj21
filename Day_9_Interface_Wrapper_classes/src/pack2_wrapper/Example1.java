package pack2_wrapper;

public class Example1 {

	public static void main(String[] args) {
		float x=20.5f;
		Float y=x;
		@SuppressWarnings("removal")
		Float obj=new Float(15.0f);
		System.out.print(x+" "+y+" "+obj);

	}

}