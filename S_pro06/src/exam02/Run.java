package exam02;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		ReportGrade r = new ReportGrade("최신형");
		
		double[] grades = new double[] {78.5, 79.3, 87.2, 93.8, 93.4};
		String[] subjects = new String[] {"국어", "영어", "수학", "사회", "체육"};
		r.setGrades(grades);
		r.setSubject(subjects);
		
		r.setGrades("수학", 92.5);
		System.out.println(Arrays.toString(r.getGrades()));
		
	}

}
