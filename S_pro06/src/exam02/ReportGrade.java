package exam02;

public class ReportGrade {
	
	private String name;
	private String[] subject;
	private double[] grades;
	
	public ReportGrade(String name) {
		this.name = name;
	}
	
	public ReportGrade(String name, String[] subject) {
		this.name = name;
		this.subject = subject;
	}
	
	public String getname () {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getSubject () {
		return subject;
	}
	
	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	
	public void setGrades(String subject, double grade) {
		/* 
		 * -로직
		 * 과목 배열의 인덱스와 점수 배열의 인덱스는 서로 연관되어 있다.
		 * 괌고 배열의 0번 인덱스의 값이 "국어"이면 국어 과목에 대한 점수는
		 * 점수 배열의 0번 인덱스에 있다.
		 * 
		 * 과목배열 : {"국어", "영어", "수학", "사회", "체육"}
		 * subject = "수학";
		 */
		int idx = -1;
		for(int i = 0; i < this.subject.length; i++) {
			if(this.subject[i].equals(subject)) {
				idx = i;
				break;
			}
		}
		this.grades[idx] = grade;
	}

	



	
	
	
	
	

}
