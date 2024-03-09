package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		
		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList : " + add1(al));
		System.out.println("LinkedList : " + add1(ll)); 
		System.out.println();
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList : " + add2(al));
		System.out.println("LinkedList : " + add2(ll));
		System.out.println();
		System.out.println("= 증간에 삭제하기 =");
		System.out.println("ArrayList : " + remove2(al));
		System.out.println("LinkedList : " + remove2(ll));
		System.out.println();
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList : " + remove1(al));
		System.out.println("LinkedList : " + remove1(ll));
	}
	
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			list.add(i+" ");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			list.add(500, "X" );
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}


/*

LinkedList = 배열의 단점을 보완

불연속적으로 존재하는 데이터를 연결

데이터의 삭제 : 단 한번의 참조 변경으로 가능

데이터의 추가 : 한번의 Node 객체생성과 두 번의 참조 변경만으로 가능

LinkedList의 단점

링크드 리스트- 연결리스트 데이터 접근성이 나쁨 	(배열은 각 요소가 연속적이라서 아무리 멀어도 한번에 찾아 갈 수 있음)
										(링크드 리스트는 불연속적이라서 한번에 찾아 갈 수 없음) 징검다리 같음
									
더블리 링크드 리스트 - 이중연결리스트(링크드 리스트의 단점을 보완),접근성 향상 (앞뒤로 이동만 좋아졌을 뿐)

더블리 써큘러 링크드 리스트 = 이중 원형 연결리스트	(마지막 요소의 다음을 맨 앞 과 연결 맨 첫번째 요소를 맨 끝에 요소하고 연결)
										

배열의 장단점

장점

배열은 구조가 간단하고 데이터를 읽는데 걸리는 시간 (접근시간,access time)이 짧다

<뒤쪽에 있는 요소나 앞쪽에 있는 요소를 읽어오는 시간이 거의 같다.>

단점 1: 크기를 변경할 수 없다(실행중에 바꿀수 없다)

크기를 변경해야 하는 경우 새로운 배열을 생성 후 데이터를 복사해야함

배열의 저장 공간이 부족하면
더큰 배열을 생성하고 기존 내용을 복사하고 참조를 변경함

단점 2: 비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.(중간에 추가하고 삭제하는게 시간이 많이 걸린다)

데이터를 추가하거나 삭제하기 위해 다른 데이터를 옮겨야함

그러나 순차적인 데이터 추가(끝에추가)와 삭제(끝부터 삭제)는 빠르다.

<순차적 추가/삭제 == ArrayList가 빠름>
<비순차적 데이터를 추가/삭제 == LikedList가 빠름>
<접근 시간	==	ArrayList가 빠름>

*/