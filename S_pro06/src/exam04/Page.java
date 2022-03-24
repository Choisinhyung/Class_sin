package exam04;

public class Page {
	
	private int pageNum; //속성
	private int limit; //속성
	
	//다음페이지 넘기는 기능
	//이전페이지 넘기는 기능
	
	
	public Page(int limit) { 
		this.limit = limit;
	}
	
	public int getPageNum() {
		return this.pageNum;
	}
	
	public void next() { //다음페이지 넘기는 기능
		if(this.nextCheck()) {
			this.pageNum++;			
		} else {
			System.out.println("더 이상 페이지를 넘길 수 없습니다.");
		}
	}
	
	public void before() { //이전페이지 넘기는 기능
		if(this.beforeCheck()) {
			this.pageNum--;	
		} else {
			System.out.println("더 이상 페이지를 넘길 수 없습니다.");
		}
	}
	
	public boolean nextCheck() { //넘길건지 확인하는 기능 
		if(this.pageNum + 1 > this.limit) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean beforeCheck() { //넘길건지 확인하는 기능 
		if(this.pageNum -1 < 1) {
			return false;
		} else {
			return true;
		}
	}
}
