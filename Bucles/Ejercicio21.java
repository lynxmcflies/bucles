public class Ejercicio21 {
	public static void main (String[] args) {
		
		int i = 0;
		int introducido = 0;
		int suma = 0;
		int media = 0;
		int x = 0;
		int masAlto = 0;
		
		for(i=0;introducido>=0;i++){
			System.out.println("Introduce un número: ");
			introducido = Integer.parseInt(System.console().readLine());
			if((introducido%2!=0)&&(introducido>0)){
				x++;
				suma += introducido;
			} else if ((introducido%2==0)&&(introducido>0)){
				if (masAlto<introducido){
					masAlto = introducido;
				}
			}
				
		}
		
		media = suma/x;
		
		System.out.println("Se han introducido "+(i-=1)+" números positivos");
		System.out.println("Y la media de los impares es "+media);
		System.out.println("El número par más alto es "+masAlto);


	}
}
