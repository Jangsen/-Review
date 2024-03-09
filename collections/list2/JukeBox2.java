package collections.list2;

import java.util.Collections;
import java.util.List;

import collections.list2.MockSongs;
import collections.list2.SongV2;

public class JukeBox2 {
	public static void main(String[] args) {
		new JukeBox2().go();
		
	}
	public void go() {
		List<SongV2> songList = MockSongs.getSongsV2();
		System.out.println(songList);
		
//		Collections.sort(songList);		//에러
		System.out.println(songList);;
	}
}
