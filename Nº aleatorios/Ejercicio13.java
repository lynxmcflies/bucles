public class Ejercicio13 {
	public static void main (String[] args) throws InterruptedException{
		int dado1 = 0;
		int dado2 = 1;
		int i = 0;
			
		for(i=0;dado1 != dado2;i++){
			dado1 = (int)((Math.random()*6)+1);
			dado2 = (int)((Math.random()*6)+1);
			System.out.print(dado1+" ");
			System.out.print(dado2+" ");
			System.out.println();
		}
		
		
	}
}



