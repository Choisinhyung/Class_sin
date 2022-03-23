package exam01;

public class Run {

	public static void main(String[] args) {
		Grade g = new Grade("국어");
		g.setScore(73.4);
		System.out.println(g.getName());
		System.out.println(g.getScore());
		System.out.println(g.getRank());

	}

}
