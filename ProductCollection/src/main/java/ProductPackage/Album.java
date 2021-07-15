package ProductPackage;

import java.util.ArrayList;

public class Album {
	
	private ArrayList<Image> images = new ArrayList<Image>();
	private String Description;
	
	public Album() {
		super();
	}
	// create a constructor which including ArrayList<Image> and String Description
	public Album(ArrayList<Image> images, String Description) {
		super();
		this.images = images;
		this.Description = Description;
		
		// connect Album to Image, since the one image can belong to many other album
		if (images.size() > 0) { 
			for(int i = 0; i < images.size(); i++) {
				images.get(i).addAlbum(this);
			}
		}
	}
	public ArrayList<Image> getImages() {
		return images;
	}
	
	public void setImage(ArrayList<Image> images) {
		this.images = images;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String des) {
		this.Description = des;
	}
}
