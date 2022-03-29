package exam04;

import java.util.Objects;

public class premium extends Customer {
	private String discount; //할인율
	private int priceTotal; //누적 구입액
	
	@Override
	public void buy(String productName, int price) {
		priceTotal += price;
		double p = _calcDiscount(price);
		System.out.printf("%s 상품을 %s 할인율 적용하여 %.0f 원에 구입하였습니다. ",productName, discount, p);
	}
	
	private double _calcDiscount(int price) {
		if(priceTotal >= 10000000) {
			discount = "10%";
			return price * (1- 0.1);
		} else if (priceTotal >= 5000000) {
			discount = "5%";
			return price * (1- 0.05);
		} else if (priceTotal >= 3000000) {
			discount = "2%";
			return price * (1- 0.02);
		} else { 
			return price;
		}
	}
	
}
