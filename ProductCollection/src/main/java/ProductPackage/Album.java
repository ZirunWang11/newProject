package ProductPackage;

import java.util.ArrayList;

public class Album {
	
	private ArrayList<Image> images = new ArrayList<Image>();
	private String Description;
	
	public Album() {
		super();
	}
	
	public Album(ArrayList<Image> images, String Description) {
		super();
		this.images = images;
		this.Description = Description;
		
		if (images.size() > 0) { // connect Album to Image;
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
