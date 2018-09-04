package testes;

public class TestaNull {

	public static void main(String[] args) {
		
		int vetor[] = new int[ 5 ];
		boolean achou = false;
		
		for( int j = 0; j < vetor.length; j++ ) {
			
			vetor[ j ] = 'S';
			
		}
		
		for( int i = 0; i < vetor.length; i++ ) {
			
			System.out.println(vetor[ i ]);
			
		}

	}

}
