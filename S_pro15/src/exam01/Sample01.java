package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


public class Sample01 {

	public static void main(String[] args) {
		//크기가 10인 arrayList 생성 (객체만 담을수있음)
		ArrayList a = new ArrayList(10);
		
//		list comparable, comparator 기존의 정렬기준을 구현하는데 사용, 그 외 다른 여러 기준으로 정렬하고자 할 때 사용
//		ㄴ sort를 사용할 때~
		
		/*
		 * List 계열 컬렉션 - ArrayList
		 */
		
		List<Integer> aList = new ArrayList<Integer>();
		// <E>는 제네릭 타입이라고 불린다. aList에 저장할 참조타입을 지정해주는 것 어떠한 자료형을 담을 수 있을지 결정하는게 제네릭타입에따라 다르다.
		//string , Integer 이런것들.
		
		aList.add(100);
		aList.add(200);
		aList.add(300);
		System.out.println("데이터 추가 " + aList);
		aList.add(2, 400);
		System.out.println("원하는 인덱스에 추가" + aList);
		
		
		List<Integer> bList = new ArrayList<Integer>();
		bList.add(500);
		bList.add(600);
		bList.add(700);
		System.out.println("데이터 추가 " + bList);
		aList.addAll(bList);
		System.out.println("alist에 blist값 추가 : " + aList);
		
		Integer i1 = aList.set(2, 350);
		System.out.println("원하는 인덱스값을 변경" + i1 + "/ " + aList);
		i1 = aList.set(3, 450);
		System.out.println("원하는 인덱스값을 변경" + i1 + "/ " + aList);
		
		boolean result1 = aList.contains(Integer.valueOf(350));
		System.out.println("가지고 있는지 확인 " + result1);
		
		int result2 = aList.indexOf(Integer.valueOf(350));
		System.out.println("어느 인덱스에 있는지 확인 " + result2 + "번");
		
		System.out.println(aList.get(0));
		System.out.println(aList.get(1));
		System.out.println(aList.get(2));
		
		System.out.println(aList.size());
		
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		
		result1 = aList.isEmpty(); //비어있는지 확인
		System.out.println(result1);
		
		bList.clear(); //모두 삭제
		result1 = bList.isEmpty();
		System.out.println(bList);
		
		aList.remove(0); // 제네릭타입이 int이기 떄문에 반환값이 int이다.
		System.out.println(aList);
		
		i1 = aList.remove(0); //이것을 pop됐다고 표현함. 삭제한 개체가 반환되게 하는 것. 나중에 다시 저장하게 만들수있음(임시)
		System.out.println(i1 + " / " + aList);
		
		//반복해서 데이터를 출력하려고 한다. 반복자
		System.out.println("iterator 사용");
		Iterator<Integer> iter = aList.iterator();
		while(iter.hasNext()) { //반복할객체가 있는지 확인
			Integer i2 = iter.next();
			System.out.println(i2);
		}
		System.out.println("for each문");
		for(Integer i3 : aList) {
			System.out.println(i3);
		}
		
		// 뒤에있는 값부터 순서대로 정렬
		System.out.println(aList);
		Collections.reverse(aList);
		System.out.println("정렬 후 : " + aList);
		// 오름차순 정렬(크기순은 sort)
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println("오름차순 정렬 후 : " + aList);
		
		//내림차순 정렬 - 오름차순 후 리버스하면 됨
		
		//바로 내림차순 하려면~
		Collections.sort(aList, new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i1, Integer i2) {
				return i1 > i2 ? -1 : 1; //1이냐 -1이냐에 따라서 오름차순 내림차순이 바뀐다..!
			}
		});
		
		System.out.println("내림차순 정렬 후 " + aList);
		
		List<Person> pList = new ArrayList<Person>();
		pList.add(new Person("홍길동", 23));
		pList.add(new Person("김철수", 25));
		pList.add(new Person("김철수", 21));
		
		Person p1 = pList.get(0);
		Person p2 = pList.get(1);
		Person p3 = pList.get(2);
		//문자열비교 .compareTo
		System.out.println(p1.getName().compareTo(p2.getName())); //결과는 양수값
		System.out.println(p2.getName().compareTo(p1.getName())); //결과는 음수값
		System.out.println(p2.getName().compareTo(p3.getName())); //결과는 음수값
		//즉 음수 양수로 각 이름의 코드값을 비교하는 것. 홍길동이 더 크기때문에 양수
		// 같으면 0이 나옴
		
		Collections.sort(pList, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getName().compareTo(p2.getName()) > 0) {
					return 1;
				} else if (p1.getName().compareTo(p2.getName()) < 0) {
					return -1;
				} else {
					if(p1.getAge() > p2.getAge()) {
						return 1;
					} else if(p1.getAge() < p2.getAge()) {
						return -1;
					}
				}
				return 0;
			}
		});
		for(Person p : pList) {
			System.out.println(p.getName() + "|" + p.getAge());			
		}
		
		
	}
}