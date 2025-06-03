//Celular.java
package semana_02;

public class Celular{
	//Atributos
	private int numero,segundosConsumidos;
	private double precioPorSegundo;
	private String usuario;
	
	//constructor
	public Celular(int num,int segundos, double precio, String user) {
		numero = num;
		segundosConsumidos = segundos;
		precioPorSegundo = precio;
		usuario = user;
	}
	
	//Setter
	public void setNumero(int num) {
		numero = num;
	}
	
	public void setSegundosConsumidos(int segundosconsumidos) {
		segundosConsumidos = segundosconsumidos;
	}
	
	public void setPrecioPorSegundo(double precioporsegundo) {
		precioPorSegundo = precioporsegundo;
	}
	
	public void setUsuario(String user) {
		usuario = user;
	}
	
	//getter
	public int getNumero() {
		return numero;
	}
	
	public int getSegundosConsumidos() {
		return segundosConsumidos;
	}
	
	public double getPrecioPorSegundo() {
		return precioPorSegundo;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	//Operaciones
	public double costoPorConsumo() {
		return segundosConsumidos*precioPorSegundo;
	}
	
	public double impuesto() {
		return costoPorConsumo()*0.18;
	}
	
	public double totalPagar() {
		return costoPorConsumo()+impuesto();
	}
}