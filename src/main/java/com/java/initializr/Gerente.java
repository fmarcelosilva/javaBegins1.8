package com.java.initializr;

public class Gerente extends Funcionarios {
	
	private int senha;
	private int numeroDeFuncGerenciados;
	
	public int getNumeroDeFuncGerenciados() {
		return numeroDeFuncGerenciados;
	}
	public void setNumeroDeFuncGerenciados(int numeroDeFuncGerenciados) {
		this.numeroDeFuncGerenciados = numeroDeFuncGerenciados;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}	

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

}
