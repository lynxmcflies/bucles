public class Ejercicio5 {
	public static void main (String[] args) {
		
		int i = 0;
		int mayor = 0;
		int menor = 200;
		int suma = 0;
		
		for(i=0;i<50;i++){
			int azar = ((int)((Math.random()*100)+100));
			System.out.print(azar+"	");
			suma += azar;

			if(azar>=mayor){
				mayor = azar;
			}
			if(azar<=menor){
				menor = azar;
			}
		}
		System.out.println("El número más grande es: "+mayor);
		System.out.println("El número más pequeño es: "+menor);
		
		int media = suma/i;
		System.out.println("La media es: "+media);
	}
}

