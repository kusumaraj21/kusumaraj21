package pack_application;


import pack_framework.BankFactory;
import pack_framework.CurrentAcc;
import pack_framework.SavingAcc;

public class GSBankfactory extends BankFactory
{

	@Override
	public GSSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		GSSavingAcc s=new GSSavingAcc(accNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public GSCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		GSCurrentAcc c=new GSCurrentAcc(accNo, accNm, accBal, creditLimit);
		return c;
	}

}