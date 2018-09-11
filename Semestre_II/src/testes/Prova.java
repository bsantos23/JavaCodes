package testes;

import java.util.Scanner;

public class Prova {

	static Scanner in = new Scanner(System.in);
	
	// MENU
	public static void menu() {
		
		System.out.print("\n1 - Cadastrar Produtos"
							+ "\n2 - Listar Produtos"
							+ "\n3 - Pesquisar Produto"
							+ "\n4 - Percentual por faixa de preço"
							+ "\n0 - Sair"
							+ "\n\nOpcao ....: ");
		
	} // fim de menu
	
	
	// CADASTRAR ITEM
	public static void cadastrarItem(String nomeDoProduto[], int quantidade[], double valor[]) {
		
		for( int i = 0; i < nomeDoProduto.length; i++ ) {
			
			System.out.print("\n## ITEM :: " + ( i + 1 ) + " ##\n");
			
			System.out.print("\nProduto .........: ");
			nomeDoProduto[ i ] = in.next().toUpperCase();
			
			System.out.print("Quantidade ......: ");
			quantidade[ i ] = in.nextInt();
			
			System.out.print("Valor ...........: R$ ");
			valor[ i ] = in.nextDouble();
			
		} // fim do for
		
	} // fim de cadastrarItem
	
	
	// ORDENA POR ORDEM ALFABETICA
	public static void ordena(String newProduto[]) {
		
		int indexAtual;
		String produtoAtual;
		
		for( int i = 0; i < newProduto.length - 1; i++ ) 
		{
			
			indexAtual = i;
			produtoAtual = newProduto[ i ];
			
			for( int j = i + 1; j < newProduto.length; j++ )
			{
				
				if( newProduto[ j ].compareTo(produtoAtual) < 0 ) {
					
					indexAtual = j;
					produtoAtual = newProduto[ j ];
					
				}
				
			} // fim do for interno
			
			newProduto[ indexAtual ] = newProduto[ i ];
			newProduto[ i ] = produtoAtual;
			
		} // fim do for externo
		
	} // fim de ordena
	

	// LISTAR PRODUTOS
	public static void listarItens(String nomeDoProduto[]) {
		
		String newProduto[] = new String[ nomeDoProduto.length ];
		
		// Copia os dados do vetor nomeDoProduto
		for( int i = 0; i < newProduto.length; i++ )
		{
			newProduto[ i ] = nomeDoProduto[ i ];
		} // fim do for
		
		// Chama ordena() para ordenar os dados 
		ordena(newProduto);
		
		// Lista os produtos cadastrados
		for( int i = 0; i < newProduto.length; i++ )
		{
			System.out.println("Produto ........: " + newProduto[ i ]);

		} // fim do for
		
	} // fim de listarItens

	
	// PESQUISAR ITEM
	public static int pesquisa(String nomeDoProduto[], String itemABuscar) {
		
		int indexDoItem = -1;
		
		for( int i = 0; i < nomeDoProduto.length; i++ )
		{
			if( nomeDoProduto[ i ].equalsIgnoreCase(itemABuscar) )
				indexDoItem = i;
		}
		
		return indexDoItem;
		
	} // fim de pesquisa

	
	// PERCENTUAL DE PRODUTOS POR FAIXA DE PRECO
	public static double percentual(double valor[]/*, int quantidade[]*/) {
		
		double valorMin = 500.0;
		double valorMax = 1000.00;
		int produtosEncontrados = 0;
		int totalDeProdutos = valor.length;
		double percentual = 0.0;
		//double valorTotal = 0;
		
		// Retorna o percentual de acordo com o valor unitário de cada produto
		for( int i = 0; i < valor.length; i++ )
		{
			//valorTotal = valor[ i ] * quantidade[ i ];
			
			if( valor[ i ] > valorMin && valor[ i ] < valorMax ) {
				produtosEncontrados++;
			}
			//valorTotal = 0;
		}
		
		// Calcula percentual
		percentual = (produtosEncontrados * 100) / totalDeProdutos;
		
		return percentual;
		
	} // fim de percentual
	
	// MAIN
	public static void main(String[] args) {
		
		int tamanhoDoVetor = 2;
		char option;
		String produto[] = new String[ tamanhoDoVetor ];
		int quantidade[] = new int[ tamanhoDoVetor ];
		double valor[] = new double[ tamanhoDoVetor ];
		String itemABuscar = null;
		
		
		do {
			
			menu();
			option = in.next().charAt(0);
			
			switch( option ) {
			
				case '1':
					
					System.out.print("\n\n>>>> CADASTRO DE PRODTOS <<<<\n\n");
					
					cadastrarItem(produto, quantidade, valor);
					
					break;
					
				case '2':
					
					System.out.print("\n\n>>>> RELACAO DE PRODUTOS CADASTRADOS <<<<\n\n");
					
					listarItens(produto);
					
					break;
			
				case '3':
					
					int res;
					
					System.out.print("\n>>>> PESQUISA DE PRODUTO <<<<\n\n");
					System.out.print("\nProduto .....: ");
					itemABuscar = in.next();
					
					res = pesquisa(produto, itemABuscar);
					
					if( res < 0 ) {
						System.out.print("\n> Produto nao encontrado!");
						System.out.print("\n");
					} else {
						System.out.print("\n>>> Produto .......: " + produto[ res ]);
						System.out.print("\n>>> Valor .........: R$ " + valor[ res ]);
						System.out.print("\n");
					}
					
					break;
			
				case '4':
					
					System.out.print("\n>>>> PERCENTUAL DE PRODUTOS ENTRE R$ 500,00 & R$ 1.000,00 <<<<\n");
					
					System.out.print("\nTotal: " + percentual(valor/*, quantidade*/) + "%");
					System.out.print("\n");
					
					break;
					
				case '0':
					
					System.exit(0);
					
				default :
					
					break;
			}
			
		} while ( option != 0 );
		
	} // fim de main

} // fecha a classe Prova
