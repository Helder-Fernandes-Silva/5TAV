package calculadoraTest;


public class Calculadora {
	
	public int somar(int a, int b) {
		
		return a + b;
	}
	
	public int sub(int a, int b) {
		
		return a - b;
	}
	
	public int mult(int a, int b) {
		
		return a * b;
	}
	
	public float div( float a, float b) {
		
		return a / b;
	}
	
	public int expo(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	public int raizQ(int a) {
		
		return (int) Math.sqrt(a);
	}
	
	public int raizCub(int a) {
		
		return (int) Math.cbrt(a);
	}
	
	public int porcent(int a, int b) {
		
		return (a*100)/b;
	}
}
