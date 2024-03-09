package collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");		//키와 밸류에 저장됨
		map.put("asdf", "1111");
		map.put("asdf", "1234");		//키 값이 같으면 기존에 있던 밸류값이 변경됨.
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("id 와 password를 입력하세요");
			System.out.print("id :");
			String id = sc.nextLine().trim();	//trim == 공백제거

			System.out.print("password :");
			String password = sc.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {		//containsKey == 키중에 입력한 값이 있는지 확인
				System.out.println("입력하신 id는 존재하지 않습니다" + " 다시 입력해주세요.");

				continue;					//다음 반복으로 넘어감
			}
			if (!(map.get(id).equals(password))) {		//값을 패스워드와 비교.
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");
			} else {
				System.out.println("id 와 비밀번호가 일치합니다.");
				break;
			}
		}
	}
}

/*
 ** 키는 중복을 허용하지 않음. 값(value)는 중복을 허용함. map.put(key,value); 로 값을 저장함
 * 
 * 
 * Hashtable 은 키(key)와 값(value)으로 null을 허용하지 않지만 HashMap 은 null을 허용함. 그래서
 * 'map.put(null,null)' 이나'map.get(null);' 과 같이 할 수 있다.
 * 
 * 
 */
