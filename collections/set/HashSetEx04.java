package collections.set;

import java.util.HashSet;

public class HashSetEx04 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	public int hashcode() {
		return (name + age).hashCode();
	}

	public String toString() {
		return name + ":" + age;
	}
}
/*
 							HashSet의 add 메서드는 새로운 요소를 추가하기 전에
 							기존에 저장된 요소와 같은 것인지 판별하기 위해
 							추가하려는 요소의 equals()와 hashcode()를 호출하기 때문에
 							equals()와 hashcode()를 목적에 맞게 오버라이딩 해야함.
 							
 							그래서 String클래스에서 
 							같은 내용의 문자열에 대한 equals()의 호출결과가
 							true인것과 같이 
 							person2클래스에서도 두 인스턴스의 name과 age가 서로 같으면
 							true를 반환하도록 equals()를 오버라이딩 했음.
 							
 							그리고 hashcode()는 String클래스의 hashcode()를 이용해서 구현
 							
 */
