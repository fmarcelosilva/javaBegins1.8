package com.java.initializr;

public class Conta {
	
	int numero;
	String titular;
	double saldo;
	boolean possuiLimite = false;
	
	void saca(double valor) {
		if(podeSacar(valor)) {
			this.saldo -= valor;
			System.out.println("Saldo atual do " + this.titular + " é: " + this.saldo);
		}
		else {
			System.out.println("Operação não permitida saldo inferior ao valor solicitado. Passar bem.");
		}
	}
	
	void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Saldo atual do " + this.titular + " é: " + this.saldo);
	}
	
	void tranfere(double valor, Conta contaDestino) {
		this.saldo -= valor;
		contaDestino.saldo +=saldo;
		System.out.println("Saldo atual do " + this.titular + " é: " + this.saldo);
		System.out.println("Saldo atual do " + contaDestino.titular + " é: " + contaDestino.saldo);
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
