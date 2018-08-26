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
							 + "5 - Sair");
			
			System.out.print("\nOpcao: ");
			option = in.next().charAt(0);
			
			switch( option )
			{
				case '1':
					
					// POPULACAO DO VETOR
					
					System.out.println("");

					for( int i = 0; i < array.length; i++ )
					{
						System.out.print((i + 1) + "º Valor: ");
						array[ i ] = in.nextInt();
					}
					
					count = 0;
					
					System.out.println("");
					
					break;
				
				case '2':
					
					// ORDENACAO
					
					if( count == array.length ) {
						
						System.out.println("\n>>> Nao foram encontrado dados a serem organizados!\n");
					
					} else {
						
						for( int i = 0; i < array.length - 1; i++ )
						{
							for( int j = 0; j < array.length - 1 - i; j++ )
							{
								if( array[ j ] > array[ j + 1] ) {
									
									aux = array[ j ];
									array[ j ] = array[ j + 1 ];
									array[ j + 1 ] = aux;
									
								} // fim do if
								
							} // fim do for interno
							
						} // fim do for externo
						
					} // fim do if/else
					
					System.out.println(""); // nova linha
					
					break;
					
				case '3':
					
					// PESQUISA
					
					if( count == array.length ) {
						
						System.out.println("\n>>>Sem dados no vetor para pesquisar!\n");
					
					} else {
						
						System.out.print("\nInforme um valor inteiro para a pesquisa: \n");
						valueForSearch = in.nextInt();
					
						while( (countWhile < array.length) && (valueForSearch != array[ countWhile ]) )
						{
							countWhile++;
						}
						
						if( countWhile == array.length ) {
							
							System.out.println("\n## A pesquisa nao retornou resultado");
						
						} else {
						
							System.out.println("\n## Resultado encontrado na posicao: " + countWhile);
						
						}

					} // fim do if/else
					
					break;
					
				case '4':
					
					// LISTAGEM
					
					System.out.println("");
					
					if( count == array.length ) {
						
						System.out.println("\n>>>Dados para listagem nao encontrados!\n");
					
					} else {
						
						for( int i = 0; i < array.length; i++ )
						{
							System.out.println("I[" + i + "] -> " + array[ i ]);
						}
					
					}
					
					System.out.println("");
					
					break;
					
				default :
					
					System.out.println("\n OPCAO NAO ENCONTRADA!\n");
					
					break;
					
			} // fim do switch
			
		} while (option != '5');

	}

}