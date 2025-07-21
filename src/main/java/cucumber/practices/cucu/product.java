package cucumber.practices.cucu;

import java.util.ArrayList;
import java.util.List;

public class product {
	private String productName;
	private int price;
	
	public product(String productName, int price ){
		this.productName=productName;
		this.price=price;
		
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductsList(){
		List<String> productList = new ArrayList<>();
		
		productList.add("Apple 16");
		productList.add("Apple 15");
		productList.add("Apple 14");
		
		return productList;
	}
}
