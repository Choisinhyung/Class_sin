package exam04;

public class Sample01 {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		// static 예약어를 사용한 변수는 클래스 명으로 사용하는 것을 권장한다
		StaticTest.share = 20;
		System.out.println(st1.share + "|" + st2.share + "|" + st3.share);
		
		st2.share = 30;
		System.out.println(st1.share + "|" + st2.share + "|" + st3.share);
		
		st3.share = 40;
		System.out.println(st1.share + "|" + st2.share + "|" + st3.share);
		
		FinalTest ft1 = new FinalTest();
		
		System.out.println(ft1.CONSTANT);
	//	ft1.CONSTANT = 20; // 할당할 수 없다. final이 쓰고 있기 때문에~
		
		FinalStaticTest fst1 = new FinalStaticTest();
		FinalStaticTest fst2 = new FinalStaticTest();
		
		System.out.println(fst1.constshare + "|" + fst2.constshare);
		System.out.println(FinalStaticTest.constshare);
//		FinalStaticTest.constshare = 30; // 변경안됨 FinalStaticTest class에서 final선언을 했기때문

	}

}
