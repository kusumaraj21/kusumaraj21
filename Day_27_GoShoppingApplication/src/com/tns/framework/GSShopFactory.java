package com.tns.framework;

import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return null;
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc p=new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return null;
	}

}
