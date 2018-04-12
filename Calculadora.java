package examen;

public class Calculadora {

	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int divideix () {
		return num1/num2;
	}
	public int potencia() {
		int potencia=1;
		for (int i = 0; i<num2;i++)
			potencia = potencia*num1;
		return potencia;
	}
	public boolean residu() {
		return num1%num2==0;
	}
}
//hola he modificat el text