package collections.list;

import java.util.Collections;
import java.util.List;

public class JukeBox1 {
	public static void main(String[] args) {
		new JukeBox1().go();
	}
	
	public void go() {
		List<String> songList = MockSongs.getSongStrings();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}
	
}
