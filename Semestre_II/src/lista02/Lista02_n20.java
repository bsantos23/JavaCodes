package lista02;

import java.util.Scanner;

public class Lista02_n20 {
	
	static Scanner in = new Scanner(System.in);
	
	// MENU DO USUARIO
	public static void menu() {
		
		System.out.print("\n1 - Cadastrar dados do vendedor"
				+ "\n2 - Alterar valor de venda"
				+ "\n3 - Consultar maior venda mensal"
				+ "\n0 - Sair"
				+ "\n\nOpcao....: ");
		
	} // fim de menu

	
	// PREENCHER DADOS DO VENDEDOR
	public static void fillArray(int cdSeller[], String dsSeller[], double cdMontValue[]) {
		
		for( int l = 0; l < cdSeller.length; l++ ) {
			
			// Recebe codigo do vendedor
			System.out.print((l + 1) + " Codigo.....................: " + "\n");
			cdSeller[ l ] = in.nextInt();
			
			// Recebe nome do vendedor
			System.out.print((l + 1) + " Vendedor ..................: " + "\n");
			dsSeller[ l ] = in.next();
			
			// Recebe valor da venda do vendedor
			System.out.print((l + 1) + " Valor total mensal ........: " + "\n");
			cdMontValue[ l ] = in.nextDouble();
			
			System.out.println();
			
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
				
				System.out.println("Novo valor....: ");
				cdMontValue[ count ] = in.nextDouble();
				
				result = "Valor de venda alterado com sucesso!";
				
			} else {
				
				result = "Vendendor nao encontrado";
				
			} // fim do if
			
			count++;
			
		} // fim do while
		
		return result;
	} // fim de changeData()
	
	
	// EXIBIR DADOS
	public static void showData(int cdSeller[], String dsSeller[], double cdMontValue[]) {
		
		for( int i = 0; i < cdSeller.length; i++ ) {
			
			System.out.println("\nVendedor ===========> " + dsSeller[ i ] + ""
					+ "\nCodigo ===========> " + cdSeller[ i ] + ""
					+ "\nValor mensal ===========> " + cdMontValue[ i ]);
			
		} // fim do for
		
	} // fim de showData()
	
	
	// CONSULTAR MAIOR VALOR DE VENDA
	public static int SearchGreaterValue(double cdMontValue[]) {
		
		double minValue;
		double maxValue = 0;
		int maxValueIndex = -1;
		
		for( int i = 0; i < cdMontValue.length - 1; i++ ) {
			
			minValue = cdMontValue[ i ];
			
			if( cdMontValue[ i + 1 ] > minValue ) {
				
				maxValue = cdMontValue[ i + 1 ];
				maxValueIndex = i + 1;
				
			} // fim do if
			
		} // fim do for
		
		return maxValueIndex;
		
	}
	
	// MAIN
	public static void main(String[] args) {
		
		final int arraySize = 2;
		int[] sellerCode = new int[ arraySize ]; //  Cria array de codigos
		String[] sellerName = new String[ arraySize ]; // Cria array de nomes
		double[] montSaleValue = new double[ arraySize ]; // Cria array de valor mensal de venda
		char option;
		String search;
		
		do {
		
			menu();
			option = in.next().charAt(0);
		
			switch( option ) 
			{
				
				case '1':
					
					fillArray(sellerCode, sellerName, montSaleValue);
					
					break;
					
				case '2':
					
					System.out.print("Nome do vendedor....: ");
					search = in.next();
					
					System.out.print("\n" + changeData(search, sellerName, montSaleValue));
					
					break;
					
				case '3':
					
					showData(sellerCode, sellerName, montSaleValue);
					
					break;
					
				case '4':
					
					int posIndex = SearchGreaterValue(montSaleValue);
					
					if( posIndex != -1 ) {
						
						System.out.println("\n>>> Maior venda do mes!!!!!");
						System.out.println(sellerCode[ posIndex ]);
						System.out.println(sellerName[ posIndex ]);
						System.out.println(montSaleValue[ posIndex ]);
						
					} else {
						
						System.out.println("\nValores iguais!");
						
					}

					break;
					
				case '0':
					
					System.exit(0);
			
			} // fim do switch
		
		} while(option != '0' );
		
	} // fim de main()

} // Fim da classe Lista02_n20
