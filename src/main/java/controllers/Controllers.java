package controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.heer.repositories.ProductRepo;

import model.Product;


@RestController
public class Controllers implements ErrorController {
	private static final Logger log= LoggerFactory.getLogger(Controllers.class);
	private static final String PATH = "/error";
	@Autowired
	private ProductRepo products;

	@RequestMapping("/index")
	public @ResponseBody String Home(){
		return "Hello";
	}
	
	@RequestMapping("/productlist")
	public @ResponseBody List<Product> ProductList() {
		log.info("The product list :" + products.findAll().toString());
		return products.findAll();
		
	}
	
	@RequestMapping(value = PATH)
    public @ResponseBody String error() {
        return "Some Error has occured, please refer to the support!";
    }

    public String getErrorPath() {
        return PATH;
    }
    
	@RequestMapping(value="/addproduct", method=RequestMethod.POST, headers = {"Content-type=application/json"})
	public @ResponseBody Product addProduct(
			@RequestBody final Product product) {
		log.info("The product list :" + products.findAll().toString());
		
		return products.save(product);
		
	}
    
    
	}
	
	

