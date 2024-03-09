package collections.arraylist;

import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		Vector v = new Vector(5);

		v.add("1");
		v.add("2");
		v.add("3");
		print(v);

		v.trimToSize();// 빈 공간을 없앤다.
		System.out.println("==After trimToSize()==");
		print(v);
		/*
		 v.trimTosize()를 호출하면 v의 빈 공간을 없애서 size와 capacity를 같게 함. 배열은 크기를 변경할 수 없기때문에
		 새로운 배열을 생성해서 그 주소값을 변수 v에 할달함. 기존의 Vector 인스턴스는 더 이상 사용할 수 없음. ( garbage
		 Collector 에 의해 수거됨 )
		 */

		v.ensureCapacity(6);
		System.out.println("==Aftet ensureCapacity"); // 공간을 6으로 바꿈
		print(v);
		/*
		 ensureCapacity(6)는 v의 capacity가 최소한 6이 되도록함. 만일 v의 capacity가 6이상이라면 아무 일도
		 일어나지 않음. 현재는 v의 capacity가 3이므로 크기가6인 배열을 생성해서 v의 내용을 복사. 기존의 인스턴스를 다시 사용하는 것이
		 아니라 새로운 인스턴스를 생성.
		 */

		v.setSize(7);
		System.out.println("==After setSize(7)"); // 크기를 7로 늘림
		print(v);
		v.clear();
		/*
		 v.setSize(7)는 v의 size가 7이 되도록함. v.capacity가 충분하면 새로 인스턴스를 생성하지 않아도 되지만 지금은
		 capacity가 6이므로 새로운 인스턴스를 생성해야함. Vector는 capacity가 부족할 경우 자동적으로 기존의 크기보다 2배의
		 크기로 증가됨 그래서 v의 capacity는 12가 됨.
		 */
		System.out.println("==After clear()=="); // 저장된 요소 삭제
		print(v);
		/*
		 v.clear()는 v의 모든 요소를 삭제함.
		 
		 */
	}

	static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :" + v.size());
		System.out.println("capacity :" + v.capacity());
	}
}
/*

	ArrayList나 Vector 같이 배열을 이용한 자료구조는 데이터를 읽어오고 저장하는 데는 효율이 좋지만
	용량을 변경해야할 때는 새로운 배열을 생성한 후 기존의 배열로부터 새로 생성된 배열로
	데이터를 복사해야하기에 효율이 떨어진다는 단점을 가지고 있음
	그래서 처음에 인스턴스를 생성할 때, 저장할 데이터의 개수를 잘 고려하여 충분한 용량의 인스턴스를 생성해야함.

*/