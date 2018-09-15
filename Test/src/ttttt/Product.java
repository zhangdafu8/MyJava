package ttttt;

import java.io.Serializable;

public class Product implements Serializable {
	private int id;
	private String name;
	private String categories;
	private double price;
	
	public Product() {
		
	}

	public Product(int id, String name, String categories, double price) {
		this.id = id;
		this.name = name;
		this.categories = categories;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "产品ID："+id+"\n产品名称："+name+"\n产品属性："+categories+"\n产品价格"+price;
		
	}

}
