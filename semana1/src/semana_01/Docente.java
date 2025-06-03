package semana_01;

public class Docente {
	public int codigo, horasTrabajadas;
	public double tarifaHoraria;
	public String nombre;
	
	public double sueldoBruto() {
		return horasTrabajadas*tarifaHoraria;
	}
	public double descuento() {
		if (sueldoBruto()<4500) return 0.12*sueldoBruto();
		else if (sueldoBruto()<6500) return 0.14*sueldoBruto();
		else return 0.16*sueldoBruto();
	}
	public double sueldoNeto() {
		return sueldoBruto()-descuento();
	}
}