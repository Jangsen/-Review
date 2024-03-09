package collections.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(90));
		map.put("안자바", new Integer(80));	
		
		
//	=====================================================================================================		
		Set set = map.entrySet();		//entrySet() 으로 가져오면 entry 전체를 가져옴 (키와 밸류가 묶인게 entry) 
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();			//map 인터페이스 , Entry 인터페이스	(Map의 내부 인터페이스)
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
//		======================================================================== entrySet 을 이용해서 map 에 저장된 값(데이터)들을 읽어오는 방법
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
//		int i = (int)it.next();
//		total += i
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());		//형변환 해야 소수점까지 나옴
		System.out.println("최고 점수 : " + Collections.max(values));	
		System.out.println("최저 점수 : " + Collections.min(values));
	}
}
