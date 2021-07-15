package ProductPackage;

import java.util.ArrayList;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class Api {

	private ArrayList<Product> fakeDBCollection = new ArrayList<>();

	public Api() {
		// create a new Image name flower and description is "a red flower"
		super();
		Image flower = new Image("flower", "a red flower");
		
		// create a new Image name sun and description is "rising sun"
		Image sun = new Image("sun", "rising sun");
		
		// create a ArrayList<Image> name images to store images that just created
		ArrayList<Image> images = new ArrayList<>();
		
		// add the flower and sun to images
		images.add(flower);
		images.add(sun);
		
		// create a new Album name landscape 
		Album landscape = new Album(images, "the landscape Album");
		
		// create a new Product p as first product, and description is "my first landsacpe product"
		// also the including the Album landscape
		Product p = new Product("product1", "my first landsacpe product", landscape);

		fakeDBCollection.add(p);

	}
	// create a RESTful api for Read/GET;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Product> getProducts() {
		
		// read the Product from exiting ArrayList, which including Product p
		return fakeDBCollection;
	}
	
	// create a RESTful api for Create/POST
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Product createProduct(Product p) {
		
		//use the ArrayList api .add to add Product p to fakeDBCollection;
		fakeDBCollection.add(p);
		
		return p;

	}
	
	
	// create a RESTful api for Update/PUT
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Product updateProduct(String oldName, Product newP) {

		Product p = null;
		
		//check is fakeDBCollection's size is 0 or not, then use the oldName of product to
		//find the product,and jump out of loop
		if (fakeDBCollection.size() != 0) {
			for (int i = 0; i < fakeDBCollection.size(); i++) {
				if (fakeDBCollection.get(i).getName() == oldName) {
					p = fakeDBCollection.get(i);
					break;
				}
			}
		}
		
		// if the product p is not null, overwrite the name,description and album
		if (p != null) {
			p.setName(newP.getName());
			p.setDescription(newP.getDescription());
			p.setAlbum(newP.getAlbum());
		}
		// return the p that been overwrite
		return p;

	}
	
	
	// create a RESTful api for DELETE
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteProduct(String name) {
		
		Product p = null;
		
		// check the fakeDBColletcion's size is 0 or not
		if (fakeDBCollection.size() != 0) {
			
			//into for loop and find the p,if find the p, then jump out of loop
			for (int i = 0; i < fakeDBCollection.size(); i++) {
				if (fakeDBCollection.get(i).getName() == name) {
					p = fakeDBCollection.get(i);
					break;
				}
			}
		}
		
		//if p is not null, remove is and out put a Success message
		if (p != null) {
			fakeDBCollection.remove(p);
			return "Successfully Deleted the Product: " + name;
		}
		
		// if p is null, out put Product not found message
		return "Product not found!";

	}

}
