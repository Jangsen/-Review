package collections.list4;

import java.util.ArrayList;
import java.util.List;

import collections.list3.SongV3;

public class MockSongs {
	public static List<String> getSongStrings(){
		List<String> songs = new ArrayList<>();
		songs.add("somersault");
		songs.add("cassidy");
		songs.add("$10");
		songs.add("havana");
		songs.add("Cassidy");
		songs.add("50 ways");
		return songs;
		
	}
	public static List<SongV3> getSongsV3(){
		List<SongV3> songs = new ArrayList<>();
		songs.add(new SongV3("somersault", "zero 7", 147));
		songs.add(new SongV3("cassiddy", "gratefull dead", 158));
		songs.add(new SongV3("$10", "hitchhiker", 140));
		
		songs.add(new SongV3("habana", "cabello", 105));
		songs.add(new SongV3("Cassidy", "grateful dead", 158));
		songs.add(new SongV3("50 ways", "simon", 102));
		return songs;
	}
}
