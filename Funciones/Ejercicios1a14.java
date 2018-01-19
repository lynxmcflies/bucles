import matematicas.Varias;

public class Ejercicios1a14 {
	public static void main (String[] args){

		//lee por teclado
		
		int n;		
		System.out.print("Introduzca un número entero positivo: ");
		n = Integer.parseInt(System.console().readLine());
		
		//es Capicuo
		
		if (matematicas.Varias.esCapicua(n)){
			System.out.println("El número "+n+" es capicúo");
		} else {
			System.out.println("El número "+n+" no es capicúo");
		}
		
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
		
		//digitos
		System.out.println("La cantidad de dígitos que tiene este número: "+matematicas.Varias.digitos(n));
		
		//voltea
		System.out.println("Este número al revés es: "+matematicas.Varias.voltea(n));
		
		//cifra de una posición
		int posicion;		
		System.out.print("Introduzca la posición del dígito: ");
		posicion = Integer.parseInt(System.console().readLine());
		System.out.println("La posicion "+posicion+" corresponde al "+matematicas.Varias.digitoN(n,posicion));
		
		//primera ocurrencia de un dígito	
		System.out.print("Introduzca el número que deseas encontrar: ");
		int busca = Integer.parseInt(System.console().readLine());
		System.out.println("Ese número aparece por primera vez en la posición: "+matematicas.Varias.posicionDeDigito(n,busca));
		
		//quita a un número n dígitos por detrás (por la derecha)
		System.out.print("Introduzca el número de dígitos que quieres quitar: ");
		int quita = Integer.parseInt(System.console().readLine());
		System.out.println("El número resultante es: "+matematicas.Varias.quitaPorDetras(n,quita));
		
		//quita a un número n dígitos por delante (por la izquierda)
		System.out.print("Introduzca el número de dígitos que quieres quitar: ");
		int quitaNum = Integer.parseInt(System.console().readLine());
		int volteado = matematicas.Varias.voltea(n);
		int aux = matematicas.Varias.quitaPorDetras(volteado,quitaNum);
		System.out.println("El número resultante es: "+matematicas.Varias.voltea(aux));
		
		//Añade un dígito a un número por detrás
		System.out.print("Introduzca el número que deseas añadir por detrás: ");
		int addNum = Integer.parseInt(System.console().readLine());
		System.out.println("El número resultante es: "+matematicas.Varias.pegaPorDetras(n,addNum));
		
		//Añade un dígito a un número por delante
		System.out.print("Introduzca el número que deseas añadir por delante: ");
		int addNumDeltante = Integer.parseInt(System.console().readLine());
		System.out.println("El número resultante es: "+matematicas.Varias.pegaPorDelante(n,addNumDeltante));
		
		
		
		
		
	}		
}
		
