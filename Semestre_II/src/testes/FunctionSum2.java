package testes;

public class FunctionSum2 {

	static int x, y;
	
	public static int soma() {
		
		x = 7;
		y = 3;
		
		return (x + y);
		
	} // fim de soma()
	

	public static void main(String[] args) {
		
		//System.out.println("Resultado: " + soma(2, 2));
		
		System.out.println("Resultado: " + soma());
		
	}

}
