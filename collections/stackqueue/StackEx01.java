package collections.stackqueue;

import java.util.Stack;

public class StackEx01 {
	
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	public static void main(String[] args) {
		goURL("2.네이버");
		goURL("3.다음");
		goURL("4.네이트");
		goURL("1.구글");
		
		printstatus();
		
	}
	
	public static void printstatus() {
		System.out.println("back :" + back);
		System.out.println("forward :" + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 입니다.");
		System.out.println();
	}
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	public static void goForward() {
		if(forward.empty()) {
			back.push(forward.pop());
		}
	}
	public static void goBack() {
		if(back.empty()) {
			forward.push(back.pop());
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
