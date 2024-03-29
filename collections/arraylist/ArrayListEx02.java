package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {
	public static void main(String[] args) {
	
		final int LIMIT	= 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		System.out.println(length);
		System.out.println(source.substring(0, 10));
		
		System.out.println("======================");
		
		List list = new ArrayList(length/LIMIT * 10);	// 초기 용량을 좀 더 크게 잡음
		
		for(int i = 0; i < length; i += LIMIT) {
			if(i + LIMIT < length) {
				list.add(source.substring(i, i+LIMIT));
			}else {
				list.add(source.substring(i));
			}
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
	}
}
