package collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);
			Collections.sort(list);
			System.out.println(list);

	}
}
/*
 중복된 값은 저장되지 않는 HashSet의 성질을 이용해서 로또번호를 만드는 예제
 Math.random을 사용했기 때문에 실행 할 때 마다 결과가 다를 것이고,
 번호를 크기순으로 정렬하기 위해서 Collections클래스의 sort(List list)를 사용
 인자로 List인터페이스 타입을 필요하기 때문에 LinkedList의 샹성사를 이용해서
 HashSet에 저장된 객체들을 LinkedList에 담아서 처리.
 
 실행결과의 정렬기준은 컬렉션에 저장된 객체가 Integer 이기때문에 
 Integer 클래스에 정의된 기본정렬이 사용
 */
