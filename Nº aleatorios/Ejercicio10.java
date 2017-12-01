public class Ejercicio10 {
	public static void main (String[] args) {
		int i = 0;
		int x = 0;
		for (i=0;i<10;i++){
			int azarLong = (int)(Math.random()*40)+1;
			int character = (int)(Math.random()*6);
			for (x=0;x<azarLong;x++){
				switch (character){
					case 0:
						System.out.print("*");
						break;
					case 1:
						System.out.print("-");
						break;
					case 2:
						System.out.print("=");
						break;
					case 3:
						System.out.print(".");
						break;
					case 4:
						System.out.print("|");
						break;
					case 5:
						System.out.print("@");
						break;
				}
			}
			System.out.println(" ");
		}
		
	}
}

