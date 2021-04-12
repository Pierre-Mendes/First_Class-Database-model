package br.edu.facthus.apoo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 987, "Fernando");
		conta.imprime();
		
		conta.deposito(200);
		conta.imprime();
		
		conta.deposito(50);
		conta.imprime();
		/*
		System.out.println("Digite o valor do depósito:");
		Scanner scanner = new Scanner(System.in);
		Integer valor = scanner.nextInt();
		conta.deposito(valor);
		conta.imprime();
		*/
		
		conta.saque(1000);
		conta.imprime();
		
		conta.saque(100);
		conta.imprime();
	}

}
