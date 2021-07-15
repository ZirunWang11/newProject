package ProductPackage;

import java.util.ArrayList;

public class Image {
	private ArrayList<Album> albums = new ArrayList<Album>();
	private String title;
	private String description;
	
	public Image() {
		super();
	}
	
	public Image(ArrayList<Album> albums, String title, String description) {
		super();
		this.albums = albums;
		this.title = title;
		this.description = description;
	}
	
	public Image( String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
	public ArrayList<Album> getAlbums() {
		return albums;
	}
	
	public void setAlum(ArrayList<Album> a) {
		albums = a;
	}
	
	public void addAlbum(Album a) {
		this.albums.add(a);
	}
	
 	public String getTitle() {
		return title;
		
	}
	public void setTitle(String t) {
		title = t;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
}
