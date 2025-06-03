package semana_01;

public class Numeros{
	//atributos publicos
	public int numero1,numero2,numero3;
	
	//operaciones publicas
	public int numeroMenor() {
		int menor = numero1;
		if (numero2 < menor) menor = numero2;
		if (numero3 < menor) menor = numero3;
		return menor;
	}
	
	public int numeroMayor() {
		int mayor = numero1;
		if (numero2 > mayor) mayor = numero2;
		if (numero3 > mayor) mayor = numero3;
		return mayor;
	}
	public int numeroMedio() {
		int menor = numeroMenor();
		int mayor = numeroMayor();
		return (numero1+numero2+numero3) - menor - mayor;
	}
}