package functions;

import java.util.Scanner;

public class Lista1_n02 {
	
	static Scanner in = new Scanner(System.in);

	// MENU
	public static void menu() {
		
		System.out.print("\n"); // Nova linha em branco
		System.out.print("+================================+\n"
						+ "||     1 - Cadastrar dados      ||\n"
						+ "||     2 - Ordenar dados        ||\n"
						+ "||     3 - Pesquisar dado       ||\n"
						+ "||     4 - Exibir dados         ||\n"
						+ "||     0 - Sair                 ||\n"
						+ "+================================+\n"
						+ "\nOpcao....: ");
		
	} // fim de menu()
	
	
	// ALTERA OS VALORES DEFAULT DO VETOR
	public static void changeDefaultValue(int vetor[]) {
		
		for( int i = 0; i < vetor.length; i++ ) {
			
			/**
			 * Altera os valores default de cada posicao de 0 para -1; 
			 * Limita a ocorrencia de problemas relacionados a pesquisa de dados no vetor; 
			 * Evita problema caso o usuario preencha uma posicao com o valor 0
			 * e um determinado trecho de codigo precise diferenciar esse valor.
			 */
			vetor[ i ] = -1;
		
		} // fim do for
		
	} // fim de changeDefaultValue()
	
	
	// PREENCHE O VETOR COM DADOS DO USUARIO
	public static void fillArray(int array[]) {
		
		for( int i = 0; i < array.length; i++ ) {
			
			System.out.print((i + 1) + " - Valor: ");
			array[ i ] = in.nextInt();
			
		} // fim do for
		
	} // fim de fillArray() 
	
	
	// ORDENA OS DADOS DO VETOR
	public static void sort(int array[]) {
		
		// Implementa o algoritmo de ordenacao Bubble Sort
		
		int aux;
		
		for( int i = 0; i < array.length; i++ ) {
			
			for( int j = 0; j < array.length - 1 - i; j++ ) {
				
				if( array[ j ] > array[ j + 1 ] ) {
					
					aux = array[ j ];
					array[ j ] = array[ j + 1 ];
					array[ j + 1 ] = aux;
					
				} // fim do if
				
			} // fim do for interno
			
		} // fim do for externo
		
	} // fim de sort()

	
	// VERIFICA SE O VETOR ESTA VAZIO
	public static boolean checkIfEmpty(int array[]) {
		
		boolean empty = false;
		int countEmpty = 0;
		
		for( int i = 0; i < array.length; i++ ) {

			if( array[ i ] == -1 ) {
				countEmpty++;
			}
			
		} // fim do for
		
		if( countEmpty == array.length ) {
			empty = true;
		}
		
		return empty;
		
	} // fim de checkIfEmpty()

	
	// PESQUISA DE DADOS
	public static int search(int array[], int valueForSearch) {
		
		int valueFound = -1;
		boolean found = false;
		
		for( int i = 0; i < array.length && found == false; i++ ) {
			
			if( array[ i ] == valueForSearch ) {
				
				valueFound = i; // Guarda o index da informacao encontrada
				found = true; // Define found como true para sair do for
			
			} // fim do if
			
		} // fim do for
		
		// Zera o valor da variavel para pesquisa
		valueForSearch = 0;
			
		return valueFound;
		
	} // fim de search()
	
	
	// EXIBI OS DADOS DO VETOR
	public static void showData(int array[]) {
		
		for( int i = 0; i < array.length; i++ ) {
			
			System.out.println("[" + i + "] >>> " + array[ i ]);
			
		} // fim do for
		
	} // fim de showData()
	
	
	// MAIN
	public static void main(String[] args) {
		
		char opcao;
		int array[] = new int[ 5 ];
		
		// Chama o metodo changeDefaultValue
		changeDefaultValue(array);
		
		do {
			
			menu();
			opcao = in.next().charAt(0);	// Recebe a opcao do usuario
			
			switch( opcao ) {
			
				case '1':
			
					System.out.println();
					
					fillArray(array);
					
					break;
				
				case '2':
				
					if( checkIfEmpty(array) == true ) {
						
						System.out.print("\n> Sem dados para ordenar!\n");
					
					} else {
						
						sort(array);
					
					} // fim do if
					
					break;
				
				case '3':
				
					if( checkIfEmpty(array) == true ) {
					
						System.out.print("\n> Sem dados para pesquisar!\n");
					
					} else {
						
						int valueForSearch;
						int indexFound;
					
						System.out.print("\n>>> Informe um valor para pesquisar: ");
						valueForSearch = in.nextInt();
						
						// Checa valor informado pelo usuario
						if( valueForSearch >= 0 ) {
							
							indexFound = search(array, valueForSearch);
							
							// Checa se a pesquisa retornou resultado
							if( indexFound != -1 ) {
								
								System.out.println("\n## Resultado encontrado na posicao: " + indexFound + "\n");
							
							} else {
								
								System.out.println("\n## A pesquisa nao retornou resultado\n");
							
							} // fim do if interno
							
						} else {
							
							System.out.println("\n!! Informe somente valores inteiros nao negativos (Ex.: 0 1 2 3 ... )");
							
						} // fim do if interno
						
					} // fim do if externo

					break;
				
				case '4':
				
					if( checkIfEmpty(array) == true ) {
						
						System.out.print("\n> Sem dados para exibir!\n");
					
					} else {
						
						System.out.println();
						
						showData(array);
					
					} // fim do if
					
					break;
					
				case '0':
					
					System.exit(0);
					
				default :
					
					System.out.print("\n***Opcao nao encontrada!\n");
					
					break;
			
			} // fim do switch
			
		} while( opcao != '0' );

	} // fim de main()

}	// fim da classe Lista1_n02 
