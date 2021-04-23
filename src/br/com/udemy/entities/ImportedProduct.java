package br.com.udemy.entities;

public class ImportedProduct extends Product{

	// Atributos
	private Double customsFee;

	// Contrutores
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public ImportedProduct() {}

	// M�todos Getteres e Setteres
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// M�todos
	public Double totalPrice() {
		return this.getPrice() + this.customsFee;
	}
	
	@Override
	public String priceTag() {
		
		return super.priceTag() + " Custo Alf�ndega: " + this.customsFee;
	}
	
}
