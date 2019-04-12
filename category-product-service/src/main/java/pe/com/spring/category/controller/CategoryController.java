package pe.com.spring.category.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.spring.model.Category;

@RestController
public class CategoryController {
	protected Logger logger = Logger.getLogger(CategoryController.class.getName());
	List<Category> listCategory= new ArrayList<>();
	
	public CategoryController() {
		listCategory.add(new Category(1,"office"));
		listCategory.add(new Category(2,"abarrotes"));
		listCategory.add(new Category(3,"Condiments"));
	}
	
	
	@RequestMapping("/listCategory")
	public List<Category> listCategory(){
		logger.info("Category.findAll()");
		return listCategory;		
	}
	
	@RequestMapping("/category/{categoryID}")
	public Category findByCategoryID(@PathVariable("categoryID") Integer categoryID) {
		logger.info("Category.findByCategoryID()");
		return listCategory.stream().filter(it -> it.getCategoryID().equals(categoryID)).findFirst().get();
	}	
	
}
