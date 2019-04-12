package pe.com.spring.product.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.spring.model.Category;

@FeignClient("category-product-service")
public interface CategoryService {

	 @RequestMapping(method = RequestMethod.GET, value = "/category/{categoryID}")
	 public Category findByCategoryID(@PathVariable("categoryID") Integer categoryID);
	  
	 
}
