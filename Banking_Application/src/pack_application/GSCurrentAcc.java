package pack_application;

import pack_framework.CurrentAcc;

public class GSCurrentAcc extends CurrentAcc
{

	public GSCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	@Override
	public String toString() {
		return String.format("GSCurrentAcc [toString()=%s]", super.toString());
	}

}