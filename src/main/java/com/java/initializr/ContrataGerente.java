package com.java.initializr;

public class ContrataGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("H. Romeu Pinto");
		g1.setSalario(15000);
		g1.setSenha(2424);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getBonificacao());
		
	}

}
