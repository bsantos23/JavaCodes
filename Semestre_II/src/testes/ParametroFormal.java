package testes;

public class ParametroFormal {

	public static int multiplicar(int x, int y) {
		
		// Parametros formais
		// x e y
		
		return (x * y);
		
	}
	
	
	public static void main(String[] args) {
	
		// Chamando a funcao multiplicar() e passando parametros formais
		System.out.println("Resultado: " + multiplicar(10, 2));

	} // fim de main

}
