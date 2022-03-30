package exam06;

public class Employee extends Customer {
	
	@Override
	public void buy(String productName, int price) {
		price = (int)(price * (1 - 0.1));  // 직원 할인가
		super.buy(productName, price); // 직원 할인가 적용 금액으로 나와야함 윗 줄 참고
	}

}
