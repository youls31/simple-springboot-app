package ma.ac.uiass.eia.springbootapp.products;

import java.io.Serializable;

public class Product implements Serializable {
  private double price;
  private String name;
  private String detail;
  private int status;
public Product(double price, String name, String detail, int status) {
	super();
	this.price = price;
	this.name = name;
	this.detail = detail;
	this.status = status;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
  
}
