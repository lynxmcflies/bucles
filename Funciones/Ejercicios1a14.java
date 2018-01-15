import matematicas.Varias;

public class Ejercicios1a14 {
	public static void main (String[] args){

		int n;		
		
		System.out.print("Introduzca un número entero positivo: ");
		n = Integer.parseInt(System.console().readLine());
		
		//es Primo
		
		if (matematicas.Varias.esPrimo(n)){
			System.out.println("El número "+n+" es primo");
		} else {
			System.out.println("El número "+n+" no es primo");
		}
		
		//siguiente Primo
		
		System.out.println("El siguiente número primo es "+matematicas.Varias.siguientePrimo(n));
		
		//potencia
		
		int exp;		
		System.out.print("Introduzca un exponente: ");
		exp = Integer.parseInt(System.console().readLine());
		System.out.println("La potencia de este número elevado al exponente introducido es "+matematicas.Varias.potencia(n,exp));
		
		//
		
	}		
}
		
