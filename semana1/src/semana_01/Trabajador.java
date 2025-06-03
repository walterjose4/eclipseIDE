package semana_01;

public class Trabajador{
	//Atributos publicos
	public int codigo,horasTrabajadas;
	public double tarifaHora;
	public String nombre;
	
	//Operaciones
	public double sueldo() {
		return horasTrabajadas*tarifaHora;
	}
}