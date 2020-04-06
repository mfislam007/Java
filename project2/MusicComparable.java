package project2;

public class MusicComparable implements Comparable<MusicComparable>{
	
	private String title;
	private String artist;
	private double duration;
	private int rating;
	
	
		public int compareTo(MusicComparable another) {
		return artist.compareToIgnoreCase(another.artist);
	}
	
	public MusicComparable(String title, String artist, double duration, int rating) {
		super();
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.rating = rating;
	}
	
	public String toString() {
		return "Music [duration=" + duration + "]";
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
