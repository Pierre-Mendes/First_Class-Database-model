package br.edu.facthus.apoo;

public class Retangulo {
	
	protected int base;
	
	protected int altura;
	
	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public void imprimePerimetro() {
		System.out.printf("Perímetro = %d\n", 
				2 * base + 2 * altura);
	}
	
	public void imprimeArea() {
		System.out.printf("Área = %d\n",
				base * altura);
	}

}
