package KH_test01;

public class Overloading {
	
	public void test() {}
	public void test(String str) {}
	public void test(int i) {}
//	public void test(String s) {} // String str와 매개변수의 타입이 값음
	public void test(char ch) {}
	public void test(String str, int i) {}
	public void test(int i, String str) {}
//	private void test(int i) {} // public void test(int i) {}와 매개변수 타입이 값음
//	public int test() {return 0;} // public void test() {}와 같은,,? 오버로딩은 반환값은 상관x
}
