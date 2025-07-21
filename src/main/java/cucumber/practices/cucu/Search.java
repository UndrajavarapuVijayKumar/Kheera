package cucumber.practices.cucu;

public class Search {
	public String displayProduct(product prod) {
		if(prod.getProductsList().contains(prod.getProductName())) {
			return prod.getProductName();
		}
		return null;
	}
}
