package listas;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Lista1_n02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int arraySize = 5;
		int[] array = new int[ arraySize ]; // cria um array de inteiros
		int option = 0; // corrigir (desperdicio de espaco de armazenamento)
		int count = 0;
		int valueForSearch;
		int aux;
		int countWhile = 0;
		int indexFound = -1;
		boolean found = false;
		
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
			option = in.nextInt();
			
			switch( option )
			{
				case 1:
					
					System.out.println("");
					
					// preenchendo vetor
					for( int i = 0; i < array.length; i++ )
					{
						System.out.print((i + 1) + "º Valor: ");
						array[ i ] = in.nextInt();
					}
					
					count = 0;
					
					System.out.println("");
					
					break;
				
				case 2:
					
					// checa se o vetor esta vazio
					if( count == array.length )
					{
						System.out.println("\n>>> Nao foram encontrado dados a serem organizados!\n");
					} else {
						
						// ordenacao do vetor
						for( int i = 0; i < array.length - 1; i++ )
						{
							for( int j = 0; j < array.length - 1 - i; j++ )
							{
								if( array[ j ] > array[ j + 1] )
								{
									
									aux = array[ j ];
									array[ j ] = array[ j + 1 ];
									array[ j + 1 ] = aux;
									
								} // fim do if interno
								
							} // fim do for interno
							
						} // fim do for externo
						
					} // fim do if/else
					
					System.out.println(""); // nova linha
					
					break;
					
				case 3:
					
					// Pesquisa de dado
					
					if( count == array.length )
					{
						System.out.println("\n>>>Sem dados no vetor para pesquisar!\n");
					} else {
						
						System.out.print("\nInforme um valor inteiro para a pesquisa: \n");
						valueForSearch = in.nextInt();
					
						while( countWhile < array.length && found == false )
						{
							if( array[ countWhile ] == valueForSearch )
							{
								found = true;
								indexFound = countWhile; 
							}
							countWhile++;
						}
					
						if( found != false )
						{
							System.out.println("\n*** A sua pesquisa retornou o seguinte resultado:\n"
									+ "Valor: " + valueForSearch + " encontrado na posicao [ " + indexFound + " ]\n");
						}
						
					} // fim do if/else
					
					break;
					
				case 4:
					
					// LISTAGEM DOS DADOS DO VETOR
					
					System.out.println("");
					
					if( count == array.length )
					{
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
			
		} while (option != 5);

	}

}