package ProductPackage;

import java.util.ArrayList;
import com.google.gson.Gson;

public class Test {
	public static void Main(String[] arg) {
		
		Api testApi = new Api();
		Gson gson = new Gson();
		
		// test Read/GET function
		ArrayList<Product> productList = testApi.getProducts();
		if (productList.size() == 0) { 
			System.out.println("No product exit!!!");
		} else {
			
			System.out.print(gson.toJson(productList));
		}
		
		// test Create/POST function
		// create two new images
		Image waterPool = new Image("water_pool", "a water pool");
		Image tree = new Image("tree", "some green tree");

		ArrayList<Image> images = new ArrayList<>();
		images.add(waterPool);
		images.add(tree);
		
		Album secondLandscape = new Album(images, "the second landscape Album");
		
		
		Product p2 = new Product("product2", "my second landsacpe product", secondLandscape);
		// create a p2 as new Product demo
		Product testProduct = testApi.createProduct(p2);
		
		System.out.println(gson.toJson(testProduct));
		
		// test update/PUT function
		Product p3 = new Product("product3", "my fakeNew landsacpe product", secondLandscape);
		//use the new Product p3 to overwrite p2
		Product testUpdateProduct = testApi.updateProduct("product2", p3);
		
		//out put the message in JSON format
		System.out.println(gson.toJson(testUpdateProduct));
		
		// test delete/DELETE function
		// delete the product1 from store
		System.out.println(testApi.deleteProduct("product1"));
		
		
	}

}
