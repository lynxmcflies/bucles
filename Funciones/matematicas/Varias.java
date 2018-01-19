package matematicas;

public class Varias {	

	/**
	* Comprueba si un número entero positivo es capicuo o no
	*
	* @param x un número entero positivo
	* @return <code>true</code> si el número es capicuo
	* @return <code>false</code> en caso contrario
	*/
	public static boolean esCapicua(int x) {
		int volteado = voltea(x);
		if(volteado == x){
			return true;
		} else {
			return false;
		}
	}
	

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


	/**
	* Calcula el número de dígitos que tiene un número
	*
	* @param x un número entero positivo
	* @return i que es el número de dígitos que tiene un número x
	*/
	public static int digitos(int x) {
		int i=0;
		for(i=0;x>0;i++){
			x = x/10;
		}
		return i;
	}


	/**
	* Le da la vuelta a un número
	*
	* @param x un número entero positivo
	* @return resultado que es el número al revés
	*/
	public static int voltea(int x) {
		int volteado = 0;
		for(int i=0;x>0;i++){
			volteado = (volteado * 10) + (x%10);
			x/=10;
		}
		return volteado;
	}


	/**
	* Número q corresponde a una posición introducida por teclado
	*
	* @param x un número entero positivo y posicion lo mismo
	* @return resultado que es el número que corresponde a esa posición
	*/
	public static int digitoN(int x, int posicion) {
		int volteado = voltea(x);
		for (int i = 1; i<posicion; i++){
			volteado/=10;
		}
		return volteado%10;
	}
	
	
	/**
	* Da la posición de la primera vez q aparece un dígito en un número largo
	*
	* @param x un número entero positivo y digito a encontrar también entero positivo
	* @return i que sería la posición, o -1 si no lo encuentra
	*/
	public static int posicionDeDigito(int x, int numero) {
		int volteado = voltea(x);
		int modulo = 999;
		int i = 0;
		for (i = 0;modulo!=numero && volteado>0;i++){
			modulo = volteado%10;
			volteado/=10;
		}
		if(modulo==numero){
			return i;
		}else{
			return -1;
		}
		
	}


	/**
	* Le quita a un número n dígitos por detrás (por la derecha).
	*
	* @param x un número entero positivo y quita el numero de digitos que quieres quitar
	* @return x que es el número con los digitos quitados
	*/
	public static int quitaPorDetras(int x, int quita) {
		for (int i=0;i<quita;i++){
			x /= 10;
		}
		return x;
	}


	/**
	* Añade un dígito a un número por detrás. (por la derecha).
	*
	* @param x un número entero positivo y addNum el dígito que quieres añadir
	* @return x que es el número con los digitos quitados
	*/
	public static int pegaPorDetras(int x, int addNum) {
		return (x*10) + addNum;
	}


	/**
	* Añade un dígito a un número por delante. (por la izquierda).
	*
	* @param x un número entero positivo y addNum el dígito que quieres añadir
	* @return el numero volteado de añadir por detrás un dígito a un número voleado
	*/
	public static int pegaPorDelante(int x, int addNum) {
		return voltea(pegaPorDetras(voltea(x),addNum));
	}

}
