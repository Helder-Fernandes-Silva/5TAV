package calculadoraTest;

public class CalculadoraDouble {
	
	public double somar(double a, double b) {
		
		return a + b;
	}
	
	public double sub(double a, double b) {
		
		return a - b;
	}
	
	public double mult(double a, double b) {
		
		return a * b;
	}
	
	public double div(double a, double b) {
		
		return a / b;
	}
	
	public double expo(double a, double b) {
		return Math.pow(a, b);
	}
	
	public double raizQ(double a) {
		
		return Math.sqrt(a);
	}
	
	public double raizCub(double a) {
		
		return Math.cbrt(a);
	}
	
	public double porcent(double a, double b) {
		
		return (a*100)/b;
	}
}
