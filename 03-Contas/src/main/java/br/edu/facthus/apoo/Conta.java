package br.edu.facthus.apoo;

public class Conta {
	
	private Integer agencia;
	
	private Integer numero;
	
	private String titular;
	
	private Integer saldo;

	public Conta(Integer agencia, Integer numero, String titular) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public void imprime() {
		System.out.printf("--------------\n"
				+ "Agência: %d\n"
				+ "Número: %d\n"
				+ "Titular: %s\n"
				+ "Saldo: R$ %d\n"
				+ "-------------\n",
				agencia,
				numero,
				titular,
				saldo);
	}
	
	public void deposito(Integer valor) {
		saldo += valor;
		System.out.printf("Depósito de R$ %d realizado com sucesso!\n",
				valor);
		
	}
	
	public void saque(Integer valor) {
		if (valor > saldo) {
			System.err.println("Saldo insuficiente.");
			return;
		}
		
		saldo -= valor;
		System.out.printf("Saque de R$ %d realizado com sucesso!\n",
				valor);
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

}
