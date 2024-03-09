package collections.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx01 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();			//Queue 인터페이스 구현체인 LinkedList 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}

/*
스택과 큐에 각각 "0","1","2" 를 같은 순서로 넣고 꺼내었을 때의 결과가 다름.

큐는 먼저 넣은 것이 먼저 꺼내지는 구조(FIFO)이기 떄문에 넣을 떄와 같은 순서.

스택은 먼저 넣은 것이 나중에 꺼내지는 구조(LIFI)이기 때문에 넣을 때의 순서와 반대로 꺼내짐.

*/
