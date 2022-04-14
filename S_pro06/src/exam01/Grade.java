package exam01;

public class Grade {
	
	private String name; // 과목명
	private double score; // 점수
	private char rank; // 등수
	
	public Grade(String name) { // 매개변수 외부값 전달한 값으로 객체가 생성될 수 있게~
		this.name = name; // 초기화
	}
	
	public Grade(String name, double score) {
		this(name); // 코드의 재사용성을 높이고, 코드량을 줄이기 위해 위 생성자 호출
		this.score = score;
	}
	
	public String getName() { // 반환형 반환타입이 스트링 / 문자열 반환하겟다고 선언했는데 리턴이 없음
		return name;
	}
	
	public void setName(String name) { // setter를 스트링 네임으로 설정
		this.name = name;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		if(score <= 100 && score >= 0) {
			this.score = score;
		} else {
			this.score = 0;
		}
		// 점수가 설정되면 여기에 등급을 분륙하기 위한 코드를 작성
		// A : 100이하 ~ 90이상, B : 90미만 ~ 80 이상, C : 80미만 ~ 70 이상
		// D : 70미만 ~ 60이상, E : 60미만 ~ 50이상, F : 40미만
		if(100 >= this.score && this.score >= 90 ) {
			this.rank = 'A';
		} else if (90 > this.score && this.score >= 80) {
			this.rank = 'B';
		} else if (80 > this.score && this.score >= 70) {
			this.rank = 'C';
		} else if (70 > this.score && this.score >= 60) {
			this.rank = 'D';
		} else if (60 > this.score && this.score >= 50) {
			this.rank = 'E';
		} else if (this.score < 40) {
			this.rank = 'F';
		}
	}
	
	public char getRank() {
		return rank;
	}

}
