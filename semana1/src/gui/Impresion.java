package gui;

public class Impresion {
	public int codigoUsuario,primeraNota,segundaNota;
	public String nombre;
	
	public double promedioNotas() {
		return (primeraNota+segundaNota)/2;
	}
}