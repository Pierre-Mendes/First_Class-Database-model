package br.edu.facthus.apoo;

import java.time.LocalDate;
import java.time.Month;

public class Main {
	
	public static void ex01() {
		Funcionario f1 = new Funcionario("João",
				2000,
				LocalDate.of(2000, Month.DECEMBER, 1));
		f1.imprimeRemuneracao();
		
		Gerente g1 = new Gerente("Maria",
				3000,
				LocalDate.of(1995, Month.JANUARY, 20),
				1000);
		g1.imprimeRemuneracao();
		
		Funcionario g2 = new Gerente("José",
				4000,
				LocalDate.of(1990, Month.OCTOBER, 10),
				500);
		g2.imprimeRemuneracao();
	}
	
	public static void ex02() {
		Retangulo r1 = new Retangulo(4, 3);
		r1.imprimePerimetro();
		r1.imprimeArea();
		
		Quadrado q1 = new Quadrado(5);
		q1.imprimePerimetro();
		q1.imprimeArea();
	}

	public static void main(String[] args) {
		// ex01();
		ex02();
	}

}
