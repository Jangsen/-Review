package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		Set set = new HashSet();
//		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		for(int i = 0; set.size() < 25; i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
		Iterator it = set.iterator();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j <board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}
}
/*
						1~50 사이의 숫자 중에서 25개를 골라 '5 x 5' 크기의 빙고판을 만드는 예.
						next()는 반환값이 Object 타입이므로 형변환해서 원래의 타입으로 되돌려 놓아야함.
						
						실행을 몇번 해보다보면 같은 숫자가 비슷한 위체에 나옴.
						HashSet은 저장된 순서를 보장하지 않고 자제적인 저장박식에 따라 순서가 결정되기 때문.
						이 경우는 HashSet이 LinkedList보다 더 나은 선택
						
 */
