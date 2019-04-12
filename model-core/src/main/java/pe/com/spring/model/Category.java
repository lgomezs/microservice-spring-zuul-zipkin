package pe.com.spring.model;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer categoryID;
	private String name;	
	private List<Product> listProduct;
	
	public Category() {}
	
	public Category(Integer categoryID, String name) {
		super();
		this.categoryID = categoryID;
		this.name = name;		
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

}
