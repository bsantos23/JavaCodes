package testes;

public class TestaVetor {

	public static void main(String[] args) {
		
		final int arraySize = 5;
		int[] array = new int[ arraySize ];
		int emptyCount = 0;
		
		for( int i = 0; i < array.length; i++ )
		{
			array[ i ] = -1;
		}
		
		for( int i = 0; i < array.length; i++ )
		{
			if( array[ i ] == -1 )
				emptyCount++;

		}
		
		System.out.println(emptyCount);
		System.out.println(array.length);
		
		if( emptyCount == array.length)
		{
			System.out.println("Vetor vazio");
		} else
		{
			System.out.println("Vetor ocupdado");
		}
			
		for( int j = 0; j < array.length; j++ )
		{
			System.out.println(array[ j ]);
		}

	}

}
