//Empleado.java
package semana_03;

public class Empleado{
	//Atributos privados
	private int codigo,categoria,numeroCelular;
	private String nombre;
	
	//Atributos de clase
	private static int contador;
	private static double sumaSueldosNetos;
	public static final double FACTOR_DESCUENTO = 0.15;
	
	//initializator block
	static {
		contador = 0;
		sumaSueldosNetos = 0;
	}
	//Constructores
	public Empleado(int codigo,int categoria, int numeroCelular, String nombre) {
		this.codigo = codigo;
		this.categoria = categoria;
		this.numeroCelular = numeroCelular;
		this.nombre = nombre;
		Empleado.contador++;
		Empleado.sumaSueldosNetos += this.sueldoNeto();
	}
	
	public Empleado(int codigo,String nombre) {
		this(codigo,2,999999999,nombre);
	}
	
	public Empleado() {
		this(4444,"ninguno");
	}
	//Setters y Getters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	public int getCategoria() {
		return this.categoria;
	}
	public int getNumeroCelular() {
		return this.numeroCelular;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	//Setter getter de clase
	public static void setContador(int contador) {
		Empleado.contador = contador;
	}
	public static void setSumaSueldosNetos(double sumasueldosnetos) {
		Empleado.sumaSueldosNetos = sumasueldosnetos;
	}
	
	public static int getContador() {
		return Empleado.contador;
	}
	public static double getSumaSueldosNetos() {
		return Empleado.sumaSueldosNetos;
	}
	
	//Operaciones
	public int sueldoBruto() {
		int sueldoBruto;
		switch(this.categoria) {
		case 0: sueldoBruto =7200; break;
		case 1: sueldoBruto = 6300; break;
		default: sueldoBruto = 5100;
		}
		return sueldoBruto;
	}
	public double descuento() {
		return Empleado.FACTOR_DESCUENTO * this.sueldoBruto();
	}
	public double sueldoNeto() {
		return this.sueldoBruto() - this.descuento();
	}
}