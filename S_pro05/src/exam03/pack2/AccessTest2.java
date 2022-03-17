package exam03.pack2; // exam03패키지 안에 pack2라는 패키지를 생성

import exam03.pack1.AccessMain; // import문

public class AccessTest2 {
	
	public static void main(String[] args) {
		AccessMain m1 = new AccessMain();
		System.out.println(m1.v1); // 모든 패키지 사용가능 public
//		System.out.println(m1.v2); // 같은 클래스,패키지,메인의 후손도 아님 protected
//		System.out.println(m1.v3); // 같은 패키지만 사용가능 default
//		System.out.println(m1.v4); // AccessMain클래스에서만~
	}

}
