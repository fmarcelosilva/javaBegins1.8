package com.java.initializr;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class InitializrApplication {

	public static void main(String[] args) {
		
		//SpringApplication.run(InitializrApplication.class, args);

		//
		// Iniciando a linguagem Java com comandos básicos para exemplificar a sintaxe
		//
		int contador = 1;
		
		byte contadorByte;
		contadorByte = (byte) contador;
		
		while(contadorByte <= 10) {
			
			// Imprimi 1 e os numeros que forem PAR
			if (contadorByte % 2 == 0 || contadorByte==1) {
				System.out.println(contadorByte);
			}
			contadorByte++;
		}
					
		//
		// Iniciando Orientação a Objetos
		//
		Conta contaDoMiro = new Conta();
		Conta contaDoJoao = new Conta();
		contaDoMiro.setTitular("Miro");
		contaDoMiro.setSaldo(1000.0);
		contaDoMiro.setPossuiLimite(true);
		contaDoJoao.setTitular("João");
		contaDoJoao.setSaldo(1000.0);
		contaDoJoao.setPossuiLimite(false);
		
		contaDoMiro.deposita(100);
		contaDoMiro.saca(150);
		contaDoMiro.tranfere(1000, contaDoJoao);
		
		contaDoJoao.deposita(100);
		contaDoJoao.saca(150);
		contaDoJoao.tranfere(1000, contaDoMiro);
		contaDoJoao.tranfere(5000, contaDoMiro); // João não possui limite operação não será realizada
	
		System.out.println("Quantidade Atual de Contas.: " + Conta.getQtdeConta()); // Informa a quantidade de Contas
		
	}
	
}
