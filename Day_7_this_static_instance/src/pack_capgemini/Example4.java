package pack_capgemini;

public class Example4 {
	 int a;
     int b;
     Example4()
     {
    	 a=20;
    	 b=23;
     }
     Example4 accept()
     {
    	 return this;
     }
     void print()
     {
    	 System.out.println("Value of ais:" +a);
    	 System.out.println("Value of ais:" +b);
     }
	public static void main(String[] args) {
		Example4 e=new Example4();
		e.print();

	}

}
