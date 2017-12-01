public class Ejercicio12 {
	public static void main (String[] args) throws InterruptedException{
		System.out.print ("\033[32m");		
		for(;;){
			int random = (int)((Math.random()*94)+32);
			System.out.print ((char)random);
			Thread.sleep(1);
		}
		
		
	}
}


