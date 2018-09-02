package functions;

import java.util.Scanner;

public class Lista1_n02 {
	
	static Scanner in = new Scanner(System.in);
	
	// MENU DO USUARIO
	public static char menu(int array[]) {
		
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
				
				register(array);
				
				break;
				
			case '2':
				
				sort(array);
				
			case '4':
				
				showData(array);
				
				break;
			
			}
			
		} while( option != '0' );
		
		return option;
		
	} // fim de menu()
	
	
	// CADASTRAR DADOS
	public static void register(int array[]) {
		
		System.out.println("");

		for( int i = 0; i < array.length; i++ )
		{
			System.out.print((i + 1) + " - Valor: ");
			array[ i ] = in.nextInt();

			//count--; // Decrementa o valor de count quando uma posicao do vetor e ocupada
			
		}
		
		System.out.println("");
		
	} // fim de register
	
	
	// ORDENAR DADOS
	public static void sort(int array[]) {

		int minIndex;
		int minValue;
		
		for( int i = 0; i < array.length - 1; i++ ) {
			
			minIndex = i;
			minValue = array[ i ];
			
			for( int j = i + 1; j < array.length; j++ ) {
				
				if( array[ j ] < minValue ) {
					
					minIndex = j;
					minValue = array[ j ];
					
				}
				
			}
			
			array[ minIndex ] = array[ i ];
			array[ i ] = minValue;
			
		} // fim do for
		
	} // fim da funcao sort
	
	public static void search() {
		
		// Your code is here
		
	}

	
	// EXIBI OS DADOS DO VETOR PARA O USUARIO
	static void showData(int array[]) {
		
		System.out.print("Valores: \n");
		
		for( int i = 0; i < array.length; i++ ) {
			
			System.out.println(array[ i ]);
			
		}
		
	} // fim de showData()
	
	public static void main(String[] args) {
		
		int inc = 5;
		int[] array = new int[ inc ];	// Cria o vetor arrau[] 
		
		//register(array);
		//exibirDados(array);
		
		menu(array);

	} // fim de main

}	// fim da classe Lista1_n02 
