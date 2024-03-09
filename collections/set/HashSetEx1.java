package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);	//HashSet에 objArr의 요소들을 저장
		}
		//HashSet에 저장되어 있는 요소들을 출력
		System.out.println(set);
	}
}
/*
 				중복된 값 저장 X
 				add메소드는 객체를 추가할 때 
 				HashSet에 이미 같은 객체가 이으면 중복으로 간주하고 저장하지 않음.
 				1이 두번 출력되었는데 둘 다 1로 보이기 때문에 구별이 안되지만
 				하나는 String 인스턴스이고 다른 하나는 Integer 인스턴스로 
 							서로 다른 객체이므로 중복으로 간주되지 않는다.
 							
 				Set을 구현한 컬렉션 클래스는 
 				List를 구현한 컬렉션 클래스와 다르게 
 				순서를 유지하지 않기때문에 저장한 순서와 다를 수 있음.
 				
 				만약 중복을 제거하는 동시에 저장한 순서를 유지하고자 한다면 
 				HashSet() 대신 LinkedList를 사용해야함.
 
 */
