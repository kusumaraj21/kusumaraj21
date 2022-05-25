package pack_Client;

import pack_application.GSBankfactory;
import pack_application.GSCurrentAcc;
import pack_application.GSSavingAcc;
import pack_framework.BankFactory;
import pack_framework.CurrentAcc;
import pack_framework.SavingAcc;

public class Client
{
	 public static void main(String[] args)
	    {
		 BankFactory t=new GSBankfactory();
	    	SavingAcc s=new GSSavingAcc(11,"Kusuma",5000,true);
	    	CurrentAcc c=new GSCurrentAcc(12,"Archana",50000,10000);
	    	 System.out.println("Saving Account");
	    	 s.withdraw(s.getAccBal());
	    	 System.out.println("Current Account");
	    	 c.withdraw(c.getBal());
	    	 
	    	 System.out.println(s);
	    	 System.out.println(c);
	    }
}