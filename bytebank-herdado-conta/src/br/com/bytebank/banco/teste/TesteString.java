package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
	
		System.out.println();
//		System
//		 - classe, java.lang, acesso publico (public)
//		out
//		 - atributo, publico, referencia, static
//		println
//		 - metodo, publico, nao static, sobrecarga,
//		   nao joga excecoes do tipo checked
	
		
		String vazio = " Alura ";
		String outroVazio = vazio.trim();
		System.out.println(vazio.contains("Al"));
		System.out.println(outroVazio);
		
		int a = 3;
		String nome = "Alura"; //object literal		
//		String outros = new String("alura");

//		System.out.println(nome.length());
		
//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		
//		char c = 'a';
//		char d = 'd';
//		String outro = nome.replace(c, d);
		
//		String outro = nome.toUpperCase();
		
//		StringBuilder nomeSB = new StringBuilder("Alura");
//		nomeSB.reverse();
		
		System.out.println(nome);
//		System.out.println(outro);
//		System.out.println(nomeSB);
	}
}
