package testes;

import java.util.Scanner;

public class MenuSimples {

	// MENU
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
		
	}
	
	public static void main(String[] args) {
		
		int opcao;
		
		Scanner in = new Scanner(System.in);
		
		do {
			
			menu();
			opcao = in.nextInt();
			
		} while();

	}

}
