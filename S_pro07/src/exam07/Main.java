package exam07;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Employee e1 = new Staff("김사원", 28);
		Employee e2 = new Assistant("박대리", 32);
		Employee e3 = new Department("이과장", 38);
		Employee e4 = new DeputyGeneral("차차장", 43);
		Employee e5 = new Director("곽부장", 48);
		
		Employee[] empArr = new Employee[5];
		empArr[0] = e1;	empArr[1] = e2;	empArr[2] = e3;
		empArr[3] = e4;	empArr[4] = e5;
		
		int year = 2022;
		for(int i = 0; i < 30; i++) {
			int month = (i + 1) % 12 == 0 ? 12 : (i + 1) % 12;
			for(int idx = 0; idx < empArr.length; idx++) {				
				System.out.printf("%d년 %d월 급여명세\n", year + (i + 1) / 12, month);
				System.out.printf("이름 : %s\n", empArr[idx].getName());
				empArr[idx].payMonth();
				empArr[idx].bonus(month);
				System.out.println("==============================");
			}
			if((rand.nextInt(9) + 1) % 4 == 0) {
				int loc = rand.nextInt(4) + 1;
				System.out.printf("%s 가 ", empArr[loc].getName());
				((Assistant)empArr[loc]).corpCard(3000000);
			}
		}
		
//		e1.payMonth();	e1.bonus();
//		e2.payMonth();	e2.bonus();	((AssistantManager)e2).corpCard(460000);
//		e3.payMonth();	e3.bonus();	((DepartmentManager)e3).corpCard(610000);
//		e4.payMonth();	e4.bonus();	((DeputyGeneralManager)e4).corpCard(826000);
//		e5.payMonth();	e5.bonus();	((Director)e5).corpCard(1300000);
	}

}
