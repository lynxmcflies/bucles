package matematicas;

public class Varias {	
	
/**
* Comprueba si un número entero positivo es primo o no.
* Un número es primo cuando únicamente es divisible entre
* él mismo y la unidad.
*
* @param x un número entero positivo
* @return <code>true</code> si el número es primo
* @return <code>false</code> en caso contrario
*/
public static boolean esPrimo(int x) {
	for (int i = 2; i < x; i++) {
		if ((x % i) == 0) {
			return false;
		}
	}
	return true;
}


/**
* Comprueba cuál es el siguiente número primo de un número
*
* @param x un número entero positivo
* @return numeroPrimo siguiente al número introducido
*/
public static int siguientePrimo(int x) {
	x++;
	for (int i = 2; i < x; i++) {
		if ((x % i) == 0) {
			x++;
		}
	}
	return x;
}


/**
* Calcula el exponente de un número elevado a otro
*
* @param x un número entero positivo, y exp lo mismo
* @return aux que es el resultado
*/
public static int potencia(int x, int exp) {
	int aux = x;
	for(int i = 1;i<exp;i++){
		aux = aux*x;
	}
	return aux;
}

}
