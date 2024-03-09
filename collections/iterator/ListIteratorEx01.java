package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());	//순방향으로 진행하면서 읽어온다
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.print(it.previous());
		}
		System.out.println();
	}
}
/*
 		Iterator는 단방향으로만 이동하기 때문에 컬렉션의 마지막 요소에 다다르면
 		더 이상 사용 할 수 없지만
 		
 		ListIterator는 양방향으로 이동하기 때문에 각 요소간의 이동이 자유로움
 		
 		다만, 이동하기 전에 반드시 hasNsxt()나 hasPrevious()를 호출해서
 		이동할 수 있는지 확인해야함.
 		
 		** Iterator의 remove 메소드는 단독으로 쓰일 수 없고,
 		   next() 와 같이 써야함.
 		   특정 위치의 요소를 삭제하는 것이 아니라,
 		   읽어 온 것을 삭제함.
 		   next() 호출 없이 remove 를 사용하면 IllegalStateException 발생
 		   
 */
