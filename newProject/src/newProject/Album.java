package newProject;

import java.util.ArrayList;

public class Album extends Product {
	
	private ArrayList<Image> images = new ArrayList<Image>();
	private String Description;
	
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
