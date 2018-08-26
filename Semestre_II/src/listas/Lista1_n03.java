package listas;

public class Lista1_n03 {

	public static void main(String[] args) {
		
		String[] array = {"Mario", "Valdir", "Carlos", "Jorge", "Bia", "Ana", "Zelia", "Manoel", "Carla"};
		int currentIndex;
		String currentValue;
		
		// Ordenacao por selecao direta
		for( int i = 0; i < array.length - 1; i++ )
		{
			currentIndex = i;
			currentValue = array[ i ];
			
			for( int j = i + 1; j < array.length; j++ )
			{
				if( array[ j ].compareToIgnoreCase(currentValue) < 0 ) {
					
					currentIndex = j;
					currentValue = array[ j ];
					
				}
				
			} // fim do for interno
			
			array[ currentIndex ] = array[ i ];
			array[ i ] = currentValue;
			
		} // fim do for externo
		
		for( int i = 0; i < array.length; i++ )
		{
			System.out.println(array[ i ]);
		}

	}

}