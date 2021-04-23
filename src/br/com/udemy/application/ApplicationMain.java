package br.com.udemy.application;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.udemy.entities.ImportedProduct;
import br.com.udemy.entities.Product;
import br.com.udemy.entities.UsedProduct;

public class ApplicationMain {

	public static void main(String[] args) throws HeadlessException, ParseException {
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa de cadastro e impress�o de etiquetas!");
		int qtdProdutos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Produtos para cadastrar?"));
		
		// Iniciando uma lista vazia de produtos
		List<Product> lp1 = new ArrayList<>();
		
		// Lendo produtos informado pelo o usu�rio
		for(int i = 1; i <= qtdProdutos; i++) {
			JOptionPane.showMessageDialog(null, "Produto #"+i);
			String opcaoString = JOptionPane.showInputDialog("Op��o:\nN - Novo\nU - Usado\nI - Importado ");
			char opcao = opcaoString.charAt(0);
			
			if(opcao == 'N') {
				String name = JOptionPane.showInputDialog("Digite o nome do Produto: ");
				Double price = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do Produto: "));
				Product p = new Product(name,price);
				lp1.add(p);
			}
			else if(opcao == 'U') {
				String name = JOptionPane.showInputDialog("Digite o nome do Produto: ");
				Double price = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do Produto: "));
				
				SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
				
				Date date = (sdf1.parse(JOptionPane.showInputDialog("Digite a data DD/MM/YYYY: ")));
				Product up = new UsedProduct(name,price,date);
				lp1.add(up);
			}
			else if(opcao == 'I') {
				String name = JOptionPane.showInputDialog("Digite o nome do Produto: ");
				Double price = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do Produto: "));
				Double customsFee = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco de Importa��o"));
				Product ip = new ImportedProduct(name,price,customsFee);
				lp1.add(ip);
			}
			else {
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
				i--;
			}
				
		}
		
		//Impress�o de Etiquetas
		JOptionPane.showMessageDialog(null, "Pre�o das Etiquetas:");		 
		for(Product product : lp1) {
			JOptionPane.showMessageDialog(null, product.priceTag());			
		}

	}

}
