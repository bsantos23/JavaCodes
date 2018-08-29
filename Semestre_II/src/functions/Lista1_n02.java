package functions;

import java.util.Scanner;

public class Lista1_n02 {
	
	static Scanner in = new Scanner(System.in);
	
	// MENU DO USUARIO
	public static void menu() {
		
		System.out.println(); // Nova linha em branco
		System.out.println("+================================+\n"
							  + "||     1 - Cadastrar dados      ||\n"
			 	  			  + "||     2 - Ordenar dados        ||\n"
			 	  			  + "||     3 - Pesquisar dado       ||\n"
			 	  			  + "||     4 - Exibir dados         ||\n"
			 	  			  + "||     0 - Sair                 ||\n"
			 	  			  + "+================================+\n"
			 	  			  + "\nOpcao....: ");
		
	} // fim de menu()
	
	
	// CADASTRAR DADOS
	public static void register() {
		
		// Your code is here
		
	} // fim de register
	
	
	// ORDENAR DADOS
	public static void sort() {
		
		// Your code is here
		
	} // fim de sort

	public static void main(String[] args) {
		
		char option;
		
		do {
			
			menu();
			option = in.next().charAt(0);
			
		} while( option != '0' );

	} // fim de main

}	// fim da classe Lista1_n02 
