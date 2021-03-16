package br.edu.facthus.apoo.main;

import br.edu.facthus.apoo.model.Produto;

public class Main {
	
	public static void main(String[] args) {
		
		//********************Objeto p1 da classe produto**************//
		Produto  p1 = new Produto(); //Instancia um produto //
		
		//atribui ID e Nome ao método 
		p1.setName("Ball");	
		p1.setId(123);
		
		//imprime  informação Nome e ID
		System.out.println("Nome:" + p1.getName());
		System.out.println("ID:" + p1.getId());
	///////////////////////////////////////////////////////////////////
		
		//Instancia um produto //
		Produto p2 = new Produto();
		p2.setName("Car");
		p2.setId(345);
		
		//imprime  informação Nome e ID
		System.out.println("Nome:" + p2.getName());
		System.out.println("ID:" + p2.getId());
		
	}
}
