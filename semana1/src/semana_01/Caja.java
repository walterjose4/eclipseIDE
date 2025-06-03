//Caja.java
package semana_01;

public class Caja{
	//Atributos publicos
	public double largo, ancho, alto, peso;
	
	//Operaciones
	public double volumen() {
		return largo*ancho*alto;
	}
	
	public double pesoVolumetrico() {
		return (volumen()/5000);
	}
	
	public double pesoFacturable() {
		double pesoVolumetrico = pesoVolumetrico();
		if (peso > pesoVolumetrico) return peso;
		else return pesoVolumetrico;
	}
}