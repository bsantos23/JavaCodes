package testes;

public class TestaVetorDouble {

	public static void main(String[] args) {
		
		double vetor[] = new double[ 5 ];
		int count = 0;
		
		for( int i = 0; i < vetor.length; i++ ) 
		{
			vetor[ i ] = -1.0;
			
			if( vetor[ i ] == -1.0 )
				count++;
			
		}
		
		if( count == vetor.length ) {
			
			System.out.println("Vetor esta vazio!");
			
		} else {
			
			System.out.println("Vetor ocupado!");
			
		}
		
		for( int i = 0; i < vetor.length; i++ ) 
		{
			System.out.print("\t" + vetor[ i ]);
		}

	}

}
