package collections.list4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collections.list3.SongV3;

public class JukeBox4 {
	public static void main(String[] args) {
		new JukeBox4().go();
	}

	public void go() {
		List<SongV3> songList = MockSongs.getSongsV3();
		System.out.println(songList);
		
		Collections.sort(songList);
		System.out.println(songList);
		
		ArtistCompare artistCompare = new ArtistCompare();
		songList.sort(artistCompare);
		System.out.println(songList);
	}
	
}
class ArtistCompare implements Comparator<SongV3>{
	public int compare(SongV3 one, SongV3 two) {
		return one.getArtist().compareTo(two.getArtist());
	}
	
}
