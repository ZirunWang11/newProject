package newProject;

import java.util.ArrayList;

public class Image extends Album {
	private ArrayList<Album> albums = new ArrayList<Album>();
	private String title;
	private String description;
	
	public ArrayList<Album> getAlbums() {
		return albums;
	}
	
	public void setAlumOfImage(ArrayList<Album> a) {
		albums = a;
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


// ask user to upload the image 

// 