package testes;

import java.util.Scanner;

public class PreencheVetor {

	static Scanner in = new Scanner(System.in);
	
	// MENU
	public static void menu(int array[]) {
		
		char option = 0;

		do {
			
			System.out.println(); // Nova linha em branco
			System.out.println("+================================+\n"
							+ "||     1 - Cadastrar dados      ||\n"
				 	  		+ "||     2 - Ordenar dados        ||\n"
				 	  		+ "||     3 - Pesquisar dado       ||\n"
				 	  		+ "||     4 - Exibir dados         ||\n"
				 	  		+ "||     0 - Sair                 ||\n"
				 	  		+ "+================================+\n"
				 	  		+ "\nOpcao....: ");
			
			option = in.next().charAt(0);
			
			switch( option ) {
			
			case '1':
				
				fillArray(array);
				
				break;
				
			case '2':
				
				sort(array);
				
				break;
				
			case '4':
				
				showData(array);
				
				break;
			
			}
			
		} while( option != '0' );
		
	} // end menu()
	
	
	// PREENCHER ARRAY
	public static void fillArray(int[] array) {
		
		for( int i = 0; i < array.length; i++ ) {
			
			System.out.print((i + 1) + "� Valor: ");
			array[ i ] = in.nextInt();
			
		}
		
	} // end fillArray()
	
	
	// EXIBIR DADOS DO VETOR
	public static void showData(int[] array) {
		
		for( int i = 0; i < array.length; i++ ) {
			
			System.out.println("I[" + i + "] -> " + array[ i ]);
			
		}
		
	} // end showData()
	
	
	// ORDENAR DADOS DO VETOR
	public static void sort(int[] array) {
		
		int aux;
		
		// Bubble Sort
		for( int i = 0; i < array.length - 1; i++ ) {
			
			for( int j = 0; j < array.length - 1 - i; j++ ) {
				
				if( array[ j ] > array[ j + 1 ] ) {
					
					aux = array[ j ];
					array[ j ] = array[ j + 1];
					array[ j + 1 ] = aux;
					
				}
				
			} // end for internal
			
		} // end for external
		
	} // end sort()
	
	
	// MAIN
	public static void main(String[] args) {
		
		// Cria vetor de inteiro
		int[] array = new int[ 5 ];
		
		//fillArray(array);
		//sort(array);
		//showData(array);
		
		menu(array);
		
	} // end main()

}
