package model.vo;

//과목에 대한 성적 정보를 가지는 클래스
public class Grade extends Subject {
	/*
	 * 점수(score)과 등급(level)를 정의
	 * getter/setter도 정의
	 */
	private double score;
	private char level;
	
	public Grade(String name) { //subject와 대응되는 생성자 필요
		super(name);
	}
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public char getLevel() {
		return level;
	}
	public void setLevel(char level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "Grade [name=" + getName() + ", score=" + score + ", level=" + level + "]";
	}
	
	
}
