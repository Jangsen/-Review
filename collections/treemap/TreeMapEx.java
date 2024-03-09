package collections.treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		//문자열 배열 생성
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		TreeMap map = new TreeMap();
		
		for(int i = 0; i <data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));
			}else {
				map.put(data[i], new Integer(1));
			}
		}
		Iterator it = map.entrySet().iterator();
	}
}

/*
		TreeMap map = new TreeMap();
		== TreeMap 인스턴스를 생성
		== 제네릭을 사용하지 않았으므로 키와 값의 타입은 모두 'Object'타입.
		== TreeMap 은 키-값 쌍을 저장하고 정렬된 순서로 유지
		
		if(map.containsKey(data[i])
		== map 에 현재 요소 'data[i]'가 있는지 확인
		== 이미 해당 키가 맵에 존재하는지 여부를 확인하기 위해 'containsKey' 메서드를 사용
		
		Integer value = (Integer)map.get(data[i]);
		== 'map'에서 현재 요소 'data[i]'에 해당하는 값을 가져옴
		== 이 값은 해당 문자열의 현재 빈도.
		
		map.put(data[i], new Integer(value.intValue()));
		==
		
*/