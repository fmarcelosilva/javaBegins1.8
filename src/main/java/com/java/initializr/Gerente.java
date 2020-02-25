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
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + this.getSalario()*0.10; // Gerente ganha o dobro que o funcionário comum
	}
	
	/*
	 *  A forma abaixo gera acoplamento com o Funcionário obrigado que se mudasse alguma regra lá precisaria mudar aqui tb
	@Override
	public double getBonificacao() {
		return this.salario * 0.20;
	}
	*/

}
