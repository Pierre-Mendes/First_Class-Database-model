package br.edu.facthus.apoo.main;

import br.edu.facthus.apoo.model.Categoria;
import br.edu.facthus.apoo.model.Fabricante;
import br.edu.facthus.apoo.model.Produto;

public class Main {
	
	public static void main(String[] args) {
		// Cria a categoria informática
		Categoria informatica = new Categoria();
		informatica.setId(1);
		informatica.setNome("Informática");
		
		// Cria os fabricantes
		Fabricante samsung = new Fabricante();
		samsung.setId(1);
		samsung.setNome("Samsung");
		
		Fabricante logitech = new Fabricante();
		logitech.setId(2);
		logitech.setNome("Logitech");
		
		// Instancia um produto
		// Atribui os campos
		Produto p = new Produto();
		p.setId(123);
		p.setNome("Monitor");
		p.setDescricao("Monitor LED 13 Polegadas");
		p.setQuantidade(10);
		p.setCategoria(informatica);
		p.setFabricante(samsung);
		
		// Imprime os campos
		System.out.println("Id: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		System.out.println("Descrição: " + p.getDescricao());
		System.out.println("Quantidade: " + p.getQuantidade());
		System.out.println("Categoria: " + p.getCategoria().getNome());
		System.out.println("Fabricante: " + p.getFabricante().getNome());
		System.out.println("------\n\n");
		
		// Instancia um 2o produto
		Produto p2 = new Produto();
		p2.setId(987);
		p2.setNome("Teclado");
		p2.setDescricao("Teclado Mecânico ABNT 2");
		p2.setQuantidade(50);
		p2.setCategoria(informatica);
		p2.setFabricante(logitech);
		
		System.out.println("Id: " + p2.getId());
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Descrição: " + p2.getDescricao());
		System.out.println("Quantidade: " + p2.getQuantidade());
		System.out.println("Categoria: " + p2.getCategoria().getNome());
		System.out.println("Fabricante: " + p2.getFabricante().getNome());
		
	}

}
