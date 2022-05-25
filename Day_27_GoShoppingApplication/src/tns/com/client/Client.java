package tns.com.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(101,"Umesh",550, true);
		NormalAcc n=new GSNormalAcc(102, "Rohit", 550,50);
		System.out.println("Prime Account");
		p.bookProduct(p.getCharge());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		
		//System.out.println(s.getNewPrimeAcc(1, "Hrishi", 1000, true));
		//System.out.println(s.getNewNormalAcc(2, "Kaustubh", 1000,50));
		
		System.out.println(p);
		System.out.println(n);
		
	}

}