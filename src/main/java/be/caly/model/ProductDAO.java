package be.caly.model;

import java.util.List;


public interface ProductDAO {
	
	public List<Product> getProduct(String dataDate);
	
	public void createProduct(Product product);
}
