package semana1;

import gui.Impresion;

public class Ejemplo {
	public static void main (String[] args)
	{
		Impresion estudiante = new Impresion();
		
		estudiante.codigoUsuario = 10;
		estudiante.nombre = "Jarumi Estela";
		estudiante.primeraNota = 20;
		estudiante.segundaNota = 14;
		
		System.out.println("Promedio: "+estudiante.promedioNotas());
	}
}