package pe.com.spring.category.model;

import java.io.Serializable;
import java.util.List;

import pe.com.spring.model.Product;

public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long categoryID;
	private String name;
	private List<Product> listProduct;

	public Long getCategoryID() {
		return categoryID;
	}

	public Category(Long categoryID, String name) {
		super();
		this.categoryID = categoryID;
		this.name = name;
	}

	public void setCategoryID(Long categoryID) {
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
