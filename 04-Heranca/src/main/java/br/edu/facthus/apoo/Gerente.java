package br.edu.facthus.apoo;

import java.time.LocalDate;

public class Gerente extends Funcionario {
	
	private Integer gratificacao;

	public Gerente(String nome, 
			Integer salario, 
			LocalDate dataAdmissao, 
			Integer gratificacao) {
		super(nome, salario, dataAdmissao);
		this.gratificacao = gratificacao;
	}
	
	@Override
	public Integer getRemuneracao() {
		return salario + gratificacao;	
	}
	
}
