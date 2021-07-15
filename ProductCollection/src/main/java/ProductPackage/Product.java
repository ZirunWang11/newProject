package ProductPackage;


public class Product {
	private String name;
	private String description;
	private Album album;
	
	
	public Product() {
		super();
	}
	public Product(String name, String description, Album album) {
		super();
			this.name = name;
			this.description = description;
			this.album = album;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
	public Album getAlbum() {
		return album;
	}
	
	public void setAlbum(Album a) {
		album = a;
	}
	
	
}


