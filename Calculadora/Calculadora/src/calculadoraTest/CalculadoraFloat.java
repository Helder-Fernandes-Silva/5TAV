package calculadoraTest;

public class CalculadoraFloat {
	
	public float somar(float a, float b) {
		
		return a + b;
	}
	
	public float sub(float a, float b) {
		
		return a - b;
	}
	
	public float mult(float a, float b) {
		
		return a * b;
	}
	
	public float div(float a, float b) {
		
		return a / b;
	}
	
	public float expo(float a, float b) {
		return (float) Math.pow(a, b);
	}
	
	public float raizQ(float a) {
		
		return (float) Math.sqrt(a);
	}
	
	public float raizCub(float a) {
		
		return (float) Math.cbrt(a);
	}
	
	public float porcent(float a, float b) {
		
		return (a*100)/b;
	}
}
