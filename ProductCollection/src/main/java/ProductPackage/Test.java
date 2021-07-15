package ProductPackage;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Test {
	public static void Main(String[] arg) {
		
		Api testApi = new Api();
		Gson gson = new Gson();
		
		// test Read/GET function;
		ArrayList<Product> productList = testApi.getProducts();
		if (productList.size() == 0) { 
			System.out.println("No product exit!!!");
		} else {
			
			System.out.print(gson.toJson(productList));
		}
		
		// test Create/POST function;
		Image flower = new Image("xxx", "a red flower");
		Image sun = new Image("sxxxun", "rising sun");

		ArrayList<Image> images = new ArrayList<>();
		images.add(flower);
		images.add(sun);

		Album landscape = new Album(images, "the landscape Album");

		Product p = new Product("product2", "my second landsacpe product", landscape);
		
		Product testProduct = testApi.createProduct(p);
		
		System.out.println(gson.toJson(testProduct));
		
		// test update/PUT function;
		Product p3 = new Product("product3", "my fakeNew landsacpe product", landscape);
		
		Product testUpdateProduct = testApi.updateProduct("product2", p3);
		System.out.println(gson.toJson(testUpdateProduct));
		
		// test delete/DELETE function;
		System.out.println(testApi.deleteProduct("product1"));
		
		
	}

}
