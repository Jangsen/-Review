package collections.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] Arr = {"cat","dog","lion","tiger"};
		
		Arrays.sort(Arr);	//String의 comparable 구현에 의한 정렬
		System.out.println("Arr = " + Arrays.toString(Arr));
		
		Arrays.sort(Arr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함.
		System.out.println("Arr = " + Arrays.toString(Arr));
		
		Arrays.sort(Arr, new Descending());		//역순 정렬
		System.out.println("Arr = " + Arrays.toString(Arr));
	}

}
class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(o2) * -1;	//-1을 곱해서 기본 정렬방식의 역으로 변경한다.
		}									//또는 c2.copareTo(c1)와 같이 순서를 바꿔도 된다.
		return -1;
	}
}
