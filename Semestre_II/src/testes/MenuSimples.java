 package testes;

import java.util.Scanner;

public class MenuSimples{

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
		
	} // fim de menu()
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		char opcao;
		
		do {
			
			menu();
			opcao = in.next().charAt(0);
			
			switch( opcao ) {
			
				case '1':
			
					fillArray(array);
					break;
				
				case '2':
				
					sort(array);
					break;
				
				case '3':
				
					// Your code is here
					break;
				
				case '4':
				
					showData(array);
					break;
					
				default :
					
					System.out.print("Opcao nao encontrada!");
					break;
			
			}
			
		} while( opcao != '0' );

	} // fim de main()

}
