package br.edu.facthus.apoo.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void exemplo01() {
		List<Integer> lista = new ArrayList<Integer>();
		System.out.println("[0] lista.size() = " + lista.size());
		
		lista.add(2);
		lista.add(4);
		lista.add(6);
		lista.add(4);
		System.out.println("[1] lista.size() = " + lista.size());
		
		for (int i = 0; i < lista.size(); ++i) {
			System.out.printf("%d -> %d\n", i, lista.get(i));
		}
		
		Integer paraRemover = 4;
		while (lista.contains(paraRemover)) {
			lista.remove(paraRemover);
		}
		
		System.out.println("[2] lista.size() = " + lista.size());
		
		for (int i = 0; i < lista.size(); ++i) {
			System.out.printf("%d -> %d\n", i, lista.get(i));
		}
		
	}
	
	public static void exemplo02() {
		List<String> lista = new ArrayList<String>();
		
		System.out.println("1) lista.size() = " + lista.size());
		
		lista.add("ABC");
		lista.add("DEF");
		lista.add("GHI");
		
		System.out.println("2) lista.size() = " + lista.size());
		for (int i = 0; i < lista.size(); ++i) {
			System.out.printf("[%d] -> %s\n", i, lista.get(i));
		}
		
		lista.remove(1);
		
		System.out.println("3) lista.size() = " + lista.size());
		for (int i = 0; i < lista.size(); ++i) {
			System.out.printf("[%d] -> %s\n", i, lista.get(i));
		}
		
	}
	
	public static void movimenta(Ponto ponto) {
		System.out.println("2) " + ponto);
		ponto.setX(ponto.getX() + 1);
		ponto.setY(ponto.getY() + 1);
		
		System.out.printf("Movimenta antes: (%d, %d)\n", ponto.getX(), ponto.getY());
		
		ponto = new Ponto(10, 20);
		System.out.println("3) " + ponto);
		
		System.out.printf("Movimenta depois: (%d, %d)\n", ponto.getX(), ponto.getY());
		
	}
	
	public static void exemplo03() {
		Ponto p1 = new Ponto(2, 3);
		System.out.println("1) " + p1);
		System.out.printf("Antes: (%d, %d)\n", p1.getX(), p1.getY());
		
		movimenta(p1);
		
		System.out.printf("Depois: (%d, %d)\n", p1.getX(), p1.getY());
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// exemplo01();
		// exemplo02();
		exemplo03();
		
	}

}
