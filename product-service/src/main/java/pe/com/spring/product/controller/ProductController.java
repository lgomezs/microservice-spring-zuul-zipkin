package pe.com.spring.product.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.spring.model.Product;
import pe.com.spring.product.feign.CategoryService;

@RestController
public class ProductController {

	protected Logger logger = Logger.getLogger(ProductController.class.getName());
	private List<Product> listProduct;
	@Autowired
	private CategoryService categoryService;
	
	
	public ProductController() {
		listProduct = new ArrayList<>();
		listProduct.add(new Product(1,"laptop",12.23, 1));
		listProduct.add(new Product(2,"mouse",1.23, 1));
		listProduct.add(new Product(3,"Hard disk",1.23, 1));
		listProduct.add(new Product(4,"milk",3.09, 2));		
	}
	
	@RequestMapping("/getAllProducts")
	public List<Product> findAll() {
		logger.info("Product.findAll()");
		return listProduct;
	}
	
	@RequestMapping("/product/{number}")
	public Product findByNumber(@PathVariable("number") Integer number) {
		logger.info(String.format("Product.findById(%s)", number));
		Product product= listProduct.stream().filter(it -> it.getId().equals(number)).findFirst().get();
		logger.info("recupere category : " + categoryService.findByCategoryID(product.getIdCategory()).getName());
		product.setNameCategory(categoryService.findByCategoryID(product.getIdCategory()).getName());
		return product;
	}	
}
