package lista02;

import java.util.Scanner;

public class Lista02_n20 {
	
	static Scanner in = new Scanner(System.in);
	
	// MENU DO USUARIO
	public static void menu() {
		
		System.out.print("\n+-------------------------------------------------------------+"
				+ "\n|                   GERENCIAMENTO DE VENDAS                   |"
				+ "\n+-------------------------------------------------------------+"
				+ "\n|               1 - CADASTRAR DADOS DO VENDEDOR               |"
				+ "\n|               2 - ALTERAR VALOR DE VENDA                    |"
				+ "\n|               3 - LISTAR VALORES DAS VENDAS                 |"
				+ "\n|               4 - CONSULTAR MAIOR VALOR VENDIDO             |"
				+ "\n|               0 - Sair                                      |"
				+ "\n+-------------------------------------------------------------+"
				+ "\n\n>>>> Opcao....: ");
		
	} // fim de menu

	
	// ALTERA VALOR PADRAO DO VETOR sellerCode[]
	public static void changeDefaultValue(int cdSeller[]) {
		
		/**
		 * Altera o valor default de cada posicao de 0 para -1 para
		 * que tarefas como comparacao de valor, pesquisa, saber
		 * se o vetor está vazio ou saber se uma determinada posição
		 * do vetor está vazia possam ser feitas sem problemas, caso 
		 * o usuario decida preencher uma determinada posicao do 
		 * vetor com o valor 0, esses problemas poderiam vir a ocorrer 
		 * porque um vetor declarado mas não preenchido, tem como 
		 * referencia o valor 0.
		 */
		
		for( int i = 0; i < cdSeller.length; i++ ) 
		{
			cdSeller[ i ] = -1;
		}

	} // fim de changeDefaultValue()
	
	
	// CHECA SE O VETOR ESTA VAZIO
	public static boolean checkIfEmpty(int cdSeller[]) {
	
		boolean empty = true;
		int count = 0;
		
		for( int i = 0; i < cdSeller.length; i++ ) {
			if( cdSeller[ i ] == -1 )
				count++;
		}
		
		if( count == cdSeller.length ) {
			empty = true;
		} else {
			empty = false;
		}
		
		return empty;
		
	} // fim de checkIfEmpty()
	
	
	// PREENCHER DADOS DO VENDEDOR
	public static void fillArray(int cdSeller[], String dsSeller[], double cdMontValue[]) {
		
		for( int i = 0; i < cdSeller.length; i++ ) {
			
			System.out.println("\n## ITEM :: " + (i + 1) + " ##");
			
			// Recebe codigo do vendedor
			System.out.print("\n> Codigo.......................: ");
			cdSeller[ i ] = in.nextInt();
			
			// Recebe nome do vendedor
			System.out.print("> Vendedor ....................: ");
			dsSeller[ i ] = in.next().toUpperCase();
			
			// Recebe valor da venda do vendedor
			System.out.print("> Total vendido no mes ........: R$ ");
			cdMontValue[ i ] = in.nextDouble();
			
			System.out.println("\n+---------------------------------------+");
			
		}
			
	} // fim de fillArray()
	
	
	// ALTERAR VALOR DE VENDA
	public static String changeData(String nameForSearch, String dsSeller[], double cdMontValue[]) {
		
		int count = 0;
		String name = nameForSearch;
		String result = "";
		boolean found = false;
		
		while( count < dsSeller.length && found != true ) {
			
			if( dsSeller[ count ].toLowerCase().contentEquals(name.toLowerCase()) ) {
				
				found = true;
				
				System.out.print("\n> Novo valor....: ");
				cdMontValue[ count ] = in.nextDouble();
				
				result = ">>> Alteracao realizada com sucesso!";
				
			} else {
				
				result = "** Vendendor nao cadastrado!";
				
			} // fim do if
			
			count++;
			
		} // fim do while
		
		return result;
		
	} // fim de changeData()
	
	
	// EXIBIR DADOS
	public static void showData(int cdSeller[], String dsSeller[], double cdMontValue[]) {
		
		for( int i = 0; i < cdSeller.length; i++ ) {
			
			System.out.println("\n> CODIGO .........: " + cdSeller[ i ] + ""
								  + "\n> VENDEDOR .......: " + dsSeller[ i ] + ""
								  + "\n> TOTAL MENSAL ...: " + cdMontValue[ i ]);
			
		} // fim do for
		
	} // fim de showData()
	
	
	// CONSULTAR MAIOR VALOR DE VENDA
	public static int SearchGreaterValue(double cdMontValue[]) {
		
		int count = 0;
		double maxValue = 0;
		int maxValueIndex = -1;
		
		// Checa se existe apenas 1 posicao no vetor
		if( cdMontValue.length == 1 )
		{
			
			maxValueIndex = 0;
			
		} else {
			
			maxValue = cdMontValue[ 0 ]; // Guarda o valor do indice 0 do vetor
			
			for( int i = 0; i < cdMontValue.length - 1; i++ )
			{	
				if( cdMontValue[ i + 1 ] > maxValue )
				{
					maxValueIndex = i + 1;
				} else {
				
					if( cdMontValue[ i ] == maxValue ) {
						count++;
					}
				
				} // fim do if externo
				
			} // fim do for
			
			if( count == cdMontValue.length )
				maxValueIndex = -2; // -2 indica que todos os valores no vetor sao iguais
			
		} // fim do if externo
			
		return maxValueIndex;
		
	} // fim de SearchGreaterValue()
	
	
	// MAIN
	public static void main(String[] args) {
		
		final int arraySize = 2;
		int[] sellerCode = new int[ arraySize ]; //  Cria array de codigos
		String[] sellerName = new String[ arraySize ]; // Cria array de nomes
		double[] montSaleValue = new double[ arraySize ]; // Cria array de valor mensal de venda
		char option;
		String search;
		
		changeDefaultValue(sellerCode);
		
		do {

			menu();
			option = in.next().charAt(0);
		
			switch( option ) 
			{
				
				case '1':
					
					System.out.print("\n+-------------------------------------------------------------+");
					System.out.print("\n|                     CADASTRAR VENDEDOR                      |");
					System.out.print("\n+-------------------------------------------------------------+\n");
						
					fillArray(sellerCode, sellerName, montSaleValue);
					
					break;
					
				case '2':
					
					if( checkIfEmpty(sellerCode) == false ) {
					
						System.out.print("\n+-------------------------------------------------------------+");
						System.out.print("\n|                   ALTERAR VALOR DE VENDA                    |");
						System.out.print("\n+-------------------------------------------------------------+\n");
					
						System.out.print("\n> Vendedor ....: ");
						search = in.next();
					
						System.out.print("\n" + changeData(search, sellerName, montSaleValue) + "\n");
						
					} else {
						
						System.out.println("\n** Sem dados para alterar!");
						
					} // fim do if
					
					break;
					
				case '3':
					
					if( checkIfEmpty(sellerCode) == false ) {
						
						System.out.print("\n+-------------------------------------------------------------+");
						System.out.print("\n|                 LISTA DE DADOS CADASTRADOS                  |");
						System.out.print("\n+-------------------------------------------------------------+\n");
						
						showData(sellerCode, sellerName, montSaleValue);
						
					} else {
						
						System.out.println("\n** Sem dados para listar!"
											  + "\n** Tente usar a opcao 1.");
						
					} // fim do if
					
					break;
					
				case '4':
									
					if( checkIfEmpty(sellerCode) == false ) {
					
						int posIndex = SearchGreaterValue(montSaleValue);
						
						if( posIndex >= 0 )
						{
							
							System.out.print("\n+-------------------------------------------------------------+");
							System.out.print("\n|                 MAIOR VALOR VENDIDO NO MES                  |");
							System.out.print("\n+-------------------------------------------------------------+\n");
						
							System.out.print("\n>>> Maior total vendido no mes: \n");
							System.out.print("\n> CODIGO: ....: " + sellerCode[ posIndex ]);
							System.out.print("\n> VENDEDOR: ..: " + sellerName[ posIndex ]);
							System.out.print("\n> TOTAL ......: R$ " + montSaleValue[ posIndex ] + "\n");
							
						} else {
							
							if( posIndex == -2 )
							{
								
								System.out.print("\n>>> Todos os vendedores possuem o mesmo total vendido no mes!"
										+ "\n>>> Use a opcao 3 do menu para listar os valores das vendas de cada vendedor.");
								
							}
							
						} // fim do if interno

				} else {
						
					System.out.println("\n** Nao existem valores cadastrados no sistema!"
										  + "\n** Use a opcao 1 para realizar o cadastro de valores.");
						
				} // fim do if

					break;
					
				case '0':
					
					System.exit(0);
					
				default :
					
					System.out.print("\n# Opcao invalida! Tente novamente.\n");
					
					break;
			
			} // fim do switch
		
		} while(option != '0' );
		
	} // fim de main()

} // Fim da classe Lista02_n20
