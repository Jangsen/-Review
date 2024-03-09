package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
// List == 순서o 중복o 
public class ArrayListEx01 {
	public static void main(String[] args) {
		
		//기본 길(용량, capacity)가 10인 ArrayList를 생성
		//Object 배열
		ArrayList list1 = new ArrayList(10);
		//ArrayList에는 객체만 저장가능
		//autoboxing에 의해 기본형이 참조형으로 자동 변환
		//원래는 ArrayList에는 기본형을 넣을 수 없다.
		//컴파일러가 autoboxing을 해주기에 사용 가능 한것
		
//		list1.add(new Integer(5));
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//subList(1,4) == 1부터 4전까지.	1 <= x < 4
		System.out.println(list1.subList(1, 4));
		//subList 에서 만들어진 list 는 읽기 전용	(읽기만 하려면 
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
//		new ArrayList(list.subList(1, 4));
//		List	sub = list.subList(1,4);	//sub는 읽기만 가능[4,2,0]
//		ArrayList list2 = new ArrayList(sub)//sub와 같은 내용의 ArrayList 생성
	
		print(list1,list2);
		
		//Collection == 인터페이스	, Collections	==	유틸 클래스	Collection을 정렬할때는 Collections의 sort 메소드를 사용하여 정렬한다.
		Collections.sort(list1);		//list와 list2를 오름차순으로 정렬한다.
		Collections.sort(list2);
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		// 첫 번째 리스트가 두 번째 리스트의 모든 요소를 포함하고 있는지 확인
		
		list2.add("B");
		list2.add("C");
//		list2.add("3, A");			추가할 위치를 지정해두묜 
		print(list1,list2);
		
		list2.set(3, "AA");
		print(list1,list2);
		
		list1.add(0, "1");
		// indexOf()는 지정 객체의 인덱스를 알려준다.
		System.out.println("index=" + list1.indexOf("1"));
		//list 에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list.retainAll(list2):" + list1.retainAll(list2));
		
		list1.remove(1);	//인덱스가 1인 객체를 삭제
		list1.remove(new Integer(1));
		print(list1,list2);
		
		
		System.out.println("list2.size():" + list2.size());
		//list2에서 list에 포함된 객체들을 삭제
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
			print(list1,list2);
		}
	}
	static void print(ArrayList list, ArrayList list2) {
		System.out.println("list:" + list);
		System.out.println("list2:" + list2);
		System.out.println();
	}
}
