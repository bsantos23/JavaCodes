package listas;

import java.util.Scanner;

public class Lista1_n02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int arraySize = 5;
		int[] array = new int[ arraySize ]; // cria um array de inteiros
		char option = 0;
		int count = 0;
		int valueForSearch;
		int aux;
		int countWhile = 0;
		
		// Preenche o vetor com valor inteiro negativo
		for( int i = 0; i < array.length; i++ )
		{
			array[ i ] = -1;
			count++;
		}	
		
		// Opcoes para o usuario
		do
		{
			System.out.println("1 - Cadastrar dados no vetor\n"
						+ "2 - Ordenar dados do vetor\n"
						+ "3 - Pesquisar dado no vetor\n"
						+ "4 - Exibir dados do vetor\n"
						+ "0 - Sair");
			
			System.out.print("\nInforme uma opcao: ");
			option = in.next().charAt(0);
			
			switch( option )
			{
				case '1':
					
					// POPULACAO DO VETOR
					
					System.out.println("");	// Nova linha em branco

					for( int i = 0; i < array.length; i++ )
					{
						System.out.print((i + 1) + " - Valor: ");
						array[ i ] = in.nextInt();

						count--; // Decrementa o valor de count quando uma posição do vetor e ocupada
					}
					
					System.out.println("");	// Nova linha em branco
					
					break;
				
				case '2':
					
					// ORDENACAO DOS DADOS
					
					if( count == array.length ) {
						
						System.out.println("\n>>> Sem dados para classificar!\n");
					
					} else {
						
						for( int i = 0; i < array.length - 1; i++ )
						{
							for( int j = 0; j < array.length - 1 - i; j++ )
							{
								if( array[ j ] > array[ j + 1] ) {
									
									aux = array[ j ];
									array[ j ] = array[ j + 1 ];
									array[ j + 1 ] = aux;
									
								}
								
							} // fim do for interno
							
						} // fim do for externo
						
					} // fim do if/else
					
					System.out.println(""); // Nova linha em branco
					
					break;
					
				case '3':
					
					// PESQUISA DE DADOS
					
					if( count == array.length ) {
						
						System.out.println("\n>>> Sem dados para pesquisar!\n");
					
					} else {
						
						System.out.print("\nInforme um valor inteiro para a pesquisa: ");
						valueForSearch = in.nextInt();
					
						while( (countWhile < array.length) && (valueForSearch != array[ countWhile ]) ) {
							
							countWhile++;
						
						}
						
						if( countWhile == array.length ) {
							
							System.out.println("\n## A pesquisa nao retornou resultado");
						
						} else {
						
							System.out.println("\n## Resultado encontrado na posicao: " + countWhile);
							System.out.println(); // Nova linha em branco
						
						} // fim do if interno
						
						countWhile = 0; // Zera o contador para nova pesquisa

					} // fim do if/else
					
					break;
					
				case '4':
					
					// LISTAGEM DOS DADOS
					
					System.out.println("");	// Nova linha em branco
					
					if( count == array.length ) {
						
						System.out.println("\n>>> Nao ha dados para listar!\n");
					
					} else {
						
						for( int i = 0; i < array.length; i++ )
						{
							System.out.println("I[" + i + "] -> " + array[ i ]);
						}
					
					} // fim do if/else
					
					System.out.println("");	// Nova linha em branco
					
					break;
					
				default :
					
					System.out.println("\nOPCAO NAO ENCONTRADA!\n");
					
			} // fim do switch/case
			
		} while(option != '0');

	}	// fim de main

}	// fim da classe Lista1_n02