package semana_03;

public class Factura{
	//Private attributes
	private String ruc, empresa;
	private int unidades;
	private double precioUnitario;
	
	//class attributes
	private static int cantFacturas;
	private static double sumaImportes;
	public static final String CADENA;
	
	static {
		CADENA = "Sunat";
		cantFacturas = 0;
		sumaImportes = 0;
	}
	
	//constructor
	public Factura(String ruc, String empresa, int unidades, double precioUnitario) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
		Factura.cantFacturas++;
		Factura.sumaImportes += this.unidades*this.precioUnitario;
	}
	
	public Factura(String ruc, String empresa) {
		this(ruc,empresa,10,50.0);
	}
	
	public Factura() {
		this("1111111111","MN-Global SRL");
	}
	
	//Setter metodos
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	//Getters de metodos
	public String getRuc() {
		return this.ruc;
	}
	
	public String getEmpresa() {
		return this.empresa;
	}
	
	public int getUnidades() {
		return this.unidades;
	}
	
	public double getPrecioUnitario() {
		return this.precioUnitario;
	}
	
	//Setter class attributes
	public static void setCantFacturas(int cantFacturas) {
		Factura.cantFacturas = cantFacturas;
	}
	
	public static void setSumaImportes(double sumaImportes) {
		Factura.sumaImportes = sumaImportes;
	}
	
	//Getters class attributes
	public static int getCantFacturas() {
		return Factura.cantFacturas;
	}
	
	public static double getSumaImportes() {
		return Factura.sumaImportes;
	}
	
	//Operaciones
	public double importeFacturado() {
		return this.unidades*this.precioUnitario;
	}
}