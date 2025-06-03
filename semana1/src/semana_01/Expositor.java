package semana_01;

public class Expositor{
	//Atributos
	public int codigo, horasTrabajadas;
	public double tarifaHora;
	public String nombre;
	//Operaciones
	public double sueldoBruto() {
		return horasTrabajadas*tarifaHora;
	}
	
	public double descuentoAfp() {
		return sueldoBruto()*0.1;
	}
	
	public double descuentoEps() {
		return sueldoBruto()*0.05;
	}
	
	public double sueldoNeto() {
		return sueldoBruto()-descuentoAfp()-descuentoEps();
	}
}