//Persona.java
package semana_01;

public class Persona{
	//Atributos
	public String nombre,apellido;
	public int edad;
	public double estatura,peso;
	//Operaciones
	public String estado(){
		if (edad<18) return "menor de edad";
		else return "mayor de edad";
	}
	public double imc() {
		return peso/(estatura*estatura);
	}
}