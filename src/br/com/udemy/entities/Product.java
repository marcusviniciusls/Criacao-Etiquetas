package br.com.udemy.entities;

public class Product {

	// Atributos
	private String name;
	private Double price;
	
	// Contrutores
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(){}

	// Métodos Getteres and Setteres
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Métodos
	public String priceTag() {
		return "Nome do Produto: " + this.getName() + " Preço: " + this.getPrice();
	}
	
	
}
