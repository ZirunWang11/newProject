package ProductPackage;

import java.util.ArrayList;

public class Test {
	public static void Main(String[] arg) {
		
		Api testApi = new Api();
		ArrayList<Product> productList = testApi.getProducts();
		
		if (productList.size() == 0) {
			System.out.println("No product exit!!!");
		} else {
			//Creating the ObjectMapper object
		      ObjectMapper mapper = new ObjectMapper();
		      //Converting the Object to JSONString
		      String jsonString = mapper.writeValueAsString(std);
		      System.out.println(jsonString);
		}
	}

}
