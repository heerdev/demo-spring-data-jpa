package model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	
	@Id
	private String productName;
	private String productCategory;
	private String productDescription;
	private BigDecimal productPrice;
	private String productCondition;
	private String productStatus;
	private int unitInStock;
	private String productManufacturer;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCondition() {
		return productCondition;
	}
	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	public String getProductManufacturer() {
		return productManufacturer;
	}
	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productCategory=" + productCategory + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productCondition=" + productCondition
				+ ", productStatus=" + productStatus + ", unitInStock=" + unitInStock + ", productManufacturer="
				+ productManufacturer + "]";
	}
	
	

}
