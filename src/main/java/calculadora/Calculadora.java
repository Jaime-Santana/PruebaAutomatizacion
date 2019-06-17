package calculadora;

public class Calculadora {
	private int numprimero;
	private int numsegundo;
	
	public int getNumprimero() {
		return numprimero;
	}
	public void setNumprimero(int numprimero) {
		this.numprimero = numprimero;
	}
	public int getNumsegundo() {
		return numsegundo;
	}
	public void setNumsegundo(int numsegundo) {
		this.numsegundo = numsegundo;
	}
	
	public int sumar(int primero, int segundo) {
		System.out.println("El resultado de la suma es: "+ (getNumprimero + getNumsegundo));
		return primero+segundo;
	}
	
	public int multiplicar(int a, int b) {
		if(b==1) {
			return a;
		}else {
			return sumar(a, multiplicar(a,b-1));
		}
	}
}

