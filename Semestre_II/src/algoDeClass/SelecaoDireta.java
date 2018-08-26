package algoDeClass;

public class SelecaoDireta {

	public static void main(String[] args) {
		
		int array[] = {2, 3, 4, 6, 5, 8, 7, 1, 9, 1};
		int currentIndex;
		int currentValue;
		
		// Percorre o vetor e guarda o index e a referencia do objeto do index atual
		for( int i = 0; i < array.length - 1; i++ )
		{
			currentIndex  = i;
			currentValue = array[ i ];
			
			// Seleciona o menor valor
			for( int j = i + 1; j < array.length; j++ )
			{
				if( array[ j ] < currentValue )
				{
					currentIndex = j;
					currentValue = array[ j ];
				}
				
			} // fim do for interno
			
			array[ currentIndex ] = array[ i ];
			array[ i ] = currentValue;
		
		} // fim do for externo
		
		// Mostra os valores na tela
		for( int i = 0; i < array.length; i++ )
		{
			System.out.println("I[" + i + "] -> " + array[ i ]);
		}

	}

}