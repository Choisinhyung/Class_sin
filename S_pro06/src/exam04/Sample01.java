package exam04;

public class Sample01 {

	public static void main(String[] args) {
		Page p = new Page(500);
		
		for(int i = 0; i < 501; i++) {
			p.next();
			System.out.println(p.getPageNum() + " 번째 페이지");		
		}
		
		for(int i = 0; i < 0; i++) {
			p.before();
			System.out.println(p.getPageNum() + " 번째 페이지");		
		}
		

	}

}
