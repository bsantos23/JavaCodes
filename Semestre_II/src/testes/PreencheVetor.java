package testes;

import java.util.Scanner;

public class PreencheVetor {

	static Scanner in = new Scanner(System.in);
	
	// PREENCHER ARRAY
	public static void fillArray(int[] array) {
		
		for( int i = 0; i < array.length; i++ ) {
			
			System.out.print((i + 1) + "º Valor: ");
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
		
		fillArray(array);
		sort(array);
		showData(array);
		
	} // end main()

}
