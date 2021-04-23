package br.com.udemy.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	
	
	// Atributos
	private Date manufacture;

	// Contrutores
	public UsedProduct(String name, Double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;
	}
	public UsedProduct() {}
	
	// Métodos Getteres e Setteres
	public Date getManufacture() {
		return manufacture;
	}
	public void setManufacture(Date manufacture) {
		this.manufacture = manufacture;
	}
	
	@Override
	public String priceTag() {
		
		return super.priceTag() + " Data de Fabricação: " + sdf1.format(getManufacture());
	}
	
	
	
	
	
	
}
