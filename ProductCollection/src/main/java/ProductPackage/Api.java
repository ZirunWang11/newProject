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
		super();
		Image flower = new Image("flower", "a red flower");
		Image sun = new Image("sun", "rising sun");

		ArrayList<Image> images = new ArrayList<>();
		images.add(flower);
		images.add(sun);

		Album landscape = new Album(images, "the landscape Album");

		Product p = new Product("product1", "my first landsacpe product", landscape);

		fakeDBCollection.add(p);

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Product> getProducts() {

		return fakeDBCollection;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Product createProduct(Product p) {

		fakeDBCollection.add(p);

		return p;

	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Product updateProduct(String oldName, Product newP) {

		Product p = null;

		if (fakeDBCollection.size() != 0) {
			for (int i = 0; i < fakeDBCollection.size(); i++) {
				if (fakeDBCollection.get(i).getName() == oldName) {
					p = fakeDBCollection.get(i);
					break;
				}
			}
		}

		if (p != null) {
			p.setName(newP.getName());
			p.setDescription(newP.getDescription());
			p.setAlbum(newP.getAlbum());
		}

		return p;

	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteProduct(String name) {

		Product p = null;

		if (fakeDBCollection.size() != 0) {
			for (int i = 0; i < fakeDBCollection.size(); i++) {
				if (fakeDBCollection.get(i).getName() == name) {
					p = fakeDBCollection.get(i);
					break;
				}
			}
		}

		if (p != null) {
			fakeDBCollection.remove(p);
			return "Successfully Deleted the Product: " + name;
		}

		return "Product not found!";

	}

}
