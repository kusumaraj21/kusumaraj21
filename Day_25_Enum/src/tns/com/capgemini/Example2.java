package tns.com.capgemini;

enum Bike
{
	Pulsar,KTM,R15,CBR,RE
}
public class Example2 {

	public static void main(String[] args) {
		Bike b=Bike.RE;
		switch(b)
		{
		case Pulsar:
			System.out.println("You choose Pulsar");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case CBR:
			System.out.println("You choose CBR");
			break;
			default:
				System.out.println("Invalid Name");
		}
	}

}