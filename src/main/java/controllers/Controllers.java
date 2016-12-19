package controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String Home(){
		return "Hello";
	}
	
	@RequestMapping("/productlist")
	public List<Product> ProductList() {
		log.info("The product list :" + products.findAll().toString());
		return products.findAll();
		
	}
	
	@RequestMapping(value = PATH)
    public String error() {
        return "Some Error has occured, please refer to the support!";
    }

    public String getErrorPath() {
        return PATH;
    }
	}
	
	

