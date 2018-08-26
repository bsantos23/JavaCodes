package testes;

public class TestaVetor {

	public static void main(String[] args) {
		
		final int arraySize = 5;
		int[] array = new int[ arraySize ];
		
		if( array.length == 0 )
		{
			System.out.println("Vetor vazio");
		} else
		{
			System.out.println("Vetor nao vazio");
		}
		
		System.out.println("teste");
		
		for( int i = 0; i < array.length; i++ )
		{
			array[ i ] = -1;
		}
		
		for( int j = 0; j < array.length; j++ )
		{
			System.out.println(array[ j ]);
		}

	}

}
