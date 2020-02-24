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
				
		// Iniciando Orientação a Objetos
		Conta contaDoMiro = new Conta();
		contaDoMiro.titular = "Miro";
		contaDoMiro.saldo = 1000.0;
		contaDoMiro.possuiLimite = true;
		contaDoMiro.deposita(1000);
		contaDoMiro.saca(950);
		contaDoMiro.saca(1500);
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.titular = "João";
		contaDoJoao.saldo = 1000.0;
		contaDoJoao.deposita(1000);
		contaDoJoao.saca(950);
		contaDoJoao.saca(1500);
		
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		contaDoMiro.tranfere(100, contaDoJoao);
		
	}
	
}