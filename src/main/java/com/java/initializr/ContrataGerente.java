package com.java.initializr;

import java.text.SimpleDateFormat;

public class ContrataGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("H. Romeu Pinto");
		g1.setSalario(15000);
		g1.setSenha(2424);
		
		System.out.println("Nome.: " + g1.getNome());
		System.out.println("Bonificação.: " + g1.getBonificacao());
		
		SimpleDateFormat formatedDate = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("============================================");
		System.out.println(formatedDate.format(System.currentTimeMillis()));
		
	}

}
