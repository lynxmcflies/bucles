public class Ex24apv4 {
	public static void main (String[] args) {
		System.out.print("Introduzca un número entero (mayor que cero): ");
		int introducido = Integer.parseInt(System.console().readLine());
		int i = 1;
		int x = 1;
		int mul = 0;
		int sum = 0;
		
		for(i=1;i<introducido;i*10){
			x = introducido%10;
			mul = x*i;
			sum = sum + mul;
			introducido = (introducido-sum)/10;
			
			
			
		}
		System.out.println(i);
		
	}
}

