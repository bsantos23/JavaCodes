package listas;

import java.util.Scanner;

public class Lista1_n01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		final int arraySize = 5;
		int[] A = new int[ arraySize ];
		int aux;
		
		System.out.println("########## Preenchimento do vetor ##########\n");
		for( int i = 0; i < A.length; i++ )
		{
			System.out.print((i + 1) + " Valor: ");
			A[ i ] = in.nextInt();
		}
		
		System.out.println("\n\n########## Ordenação do vetor ##########\n");
		
		// Mostra vetor nao ordenado
		System.out.print("\nVetor nao ordenado >>> ");
		for( int i = 0; i < A.length; i++ )
		{
			System.out.print(A[ i ] + " ");
		}
		
		for( int i = 0; i < A.length - 1; i++ )
		{
			for( int j = 0; j < A.length - 1 - i; j++ )
			{
				if( A[ j ] > A[ j + 1 ] )
				{
					
					aux = A[ j ];
					A[ j ] = A[ j + 1 ];
					A[ j + 1 ] = aux;
					
				} // fim do if
				
			} // fim do for interno
			
		} // fim do for externo
		
		// Mostra vetor ordenado
		System.out.print("\nVetor ordenado >>> ");
		for( int i = 0; i < A.length; i++ )
		{
			System.out.print(A[ i ] + " ");
		}
		
		System.out.println("\n\n########## Pesquisa no vetor ##########\n");
		
		// pesquisa
		for( int i = 0; i < A.length; i++ )
		{
			if( A[ i ] == 2 )
			{
				System.out.println("Valor 2 encontrado na posição -> " + i );
			} else {
				System.out.println("Valor 2 nao encontrado");
			}
			
		} // fim do for
		
	}

}
