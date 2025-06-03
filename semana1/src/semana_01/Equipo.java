package semana_01;

public class Equipo{
	//Atributos publicos
	public int codigo;
	public double precioDolares;
	public String marca,color;
	
	//Operaciones públicas
	public double precioEquipoSoles() {
		double cambio=3.59;
		return precioDolares*cambio;
	}
	
	public double precioEquipoEuros() {
		double cambio=1.2;
		return precioDolares*cambio;
	}
}