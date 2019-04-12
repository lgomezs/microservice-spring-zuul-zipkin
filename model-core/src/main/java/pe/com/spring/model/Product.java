package pe.com.spring.model;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private double price;
	private Integer idCategory;
	private String nameCategory;
	
	public Product() {}
	
	public Product(Integer id, String name, double price,Integer idCategory) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.idCategory=idCategory;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getCategory() {
		return idCategory;
	}

	public void setCategory(Integer category) {
		this.idCategory = category;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public Integer getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Integer idCategory) {
		this.idCategory = idCategory;
	}
	
	

}
