package algoDeClass;

public class BubbleSort {

	public static void main(String[] args) {
		
		 int array[] = {3, 5, 9, 7, 1, 4, 2, 8, 6};
		 int aux;
		 
		 for( int i = 0; i < array.length - 1; i++ )
		 {
			 for( int j = 0; j < array.length - 1 - i; j++ )
			 {
				 if( array[ j ] > array[ j + 1 ] )
				 {
					 aux = array[ j ];	// guarda o valor do index corrente
					 array[ j ] = array[ j + 1 ];	// troca o valor do index corrente pelo valor do proximo index
					 array[ j + 1 ] = aux;	// a referencia do proximo index e trocada pelo valor de aux
				 }	 
					 
			 } // fim do for interno
			 
		 } // fim do for externo
		 
		 
		 for( int i = 0; i < array.length; i++ )
		 {
			 System.out.print(array[ i ] + "\t");
		 }

	}

}
