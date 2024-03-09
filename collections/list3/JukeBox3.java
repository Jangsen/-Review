package collections.list3;

import java.util.Collections;
import java.util.List;

import collections.list3.MockSongs;
import collections.list3.SongV3;

public class JukeBox3 {
	public static void main(String[] args) {
		new JukeBox3().go();
		
	}
	public void go() {
		List<SongV3> songList = MockSongs.getSongsV3();
		System.out.println(songList);
		
		Collections.sort(songList);
		System.out.println(songList);;
	}
}
