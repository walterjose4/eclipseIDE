package semana_01;

public class Filmacion{
	//Atributos
	public int codigo, duracionMinutos;
	public String titulo;
	public double precioSoles;
	//Operaciones
	public double precioVideoDolares() {
		return precioSoles*3.59;
	}
}