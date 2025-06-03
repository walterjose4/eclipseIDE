package semana_02;

public class Computadora{
	//atributos privados
	private int codigo;
	private double dolares;
	private String marca,color;
	
	//constructor
	public Computadora(int cod, double dol, String marc, String col){
		codigo = cod;
		dolares = dol;
		marca = marc;
		color = col;
	}
	
	//setter
	public void setCodigo(int cod) {
		codigo = cod;
	}
	
	public void setDolares(double dol) {
		dolares = dol;
	}
	
	public void setMarca(String marc) {
		marca = marc;
	}
	
	public void setColor(String col) {
		color = col;
	}
	
	//getter
	public int getCodigo() {
		return codigo;
	}
	
	public double getDolares() {
		return dolares;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getColor() {
		return color;
	}
	
	//operaciones
	public double precioSoles() {
		return dolares*3.25;
	}
	
	public double precioEuros() {
		return dolares/1.2;
	}
}