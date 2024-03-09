package collections.iterator;


import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println();
		System.out.println(list);
	}
}

/*
 ListIterator 와 Enumeration
 
 Enumeration은 컬렉션 프레임웍이 만들어지기 이전에 사용.
 Iterator의 구버전 되도록이면 Iterator를 사용하기
 Enumeration 과 Iterator는 메소드 이름만 다를뿐 기능은 같음
 
 ListIterator는 Iterator를 상속받아서 기능을 추가한것
 컬렉션의 요소에 접근할 때 Iterator는 단방향으로만 이동이 가능하지만
 					 ListIterator는 양방향으로 이동이 가능함
 					 
 ArrayList나 LinkedList 처럼 List인터페이스를 구현한 컬렉션에서만 사용이 가능
 
 */
