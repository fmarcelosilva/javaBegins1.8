package com.java.initializr;

public class Conta {
	
	private static int qtdeConta;
	private int numero;
	private String titular;
	private double saldo;
	private boolean possuiLimite = false;
	
	// Construtor da Classe utilizado para controlar quantidade de contas
	Conta() {
		Conta.qtdeConta += 1;
	}	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean isPossuiLimite() {
		return possuiLimite;
	}

	public void setPossuiLimite(boolean possuiLimite) {
		this.possuiLimite = possuiLimite;
	}
	
	public static int getQtdeConta() {
		return Conta.qtdeConta;
	}

	void saca(double valor) {
		if(podeSacar(valor)) {
			this.saldo -= valor;
		}
		else {
			System.out.println("Operação não permitida saldo do " + this.titular + " inferior ao valor solicitado. Passar bem.");
		}
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	void tranfere(double valor, Conta contaDestino) {
		if(podeSacar(valor)) {
			this.saldo -= valor;
			contaDestino.saldo +=valor;
			System.out.println("\n=================================");
			System.out.println("Tranferencia realizada com sucesso!");
			System.out.println("Saldo atual do " + this.titular + " é: " + this.saldo);
			System.out.println("Saldo atual do " + contaDestino.titular + " é: " + contaDestino.saldo);	
		}
		else {
			System.out.println("\nOperação não permitida saldo do " + this.titular + " inferior ao valor solicitado.\n");
		}
	}
	
	boolean podeSacar(double valor) {				
		if(this.saldo >= valor || this.possuiLimite) {
			return true;
		}
		else {
			return false;
		}
	}

}
 