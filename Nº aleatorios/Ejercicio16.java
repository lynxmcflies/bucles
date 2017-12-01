public class Ejercicio16 {
	public static void main (String[] args){
		int i = 0;
		String dibujo1 = "";		
		String dibujo2 = "";
		String dibujo3 = "";
		String figura = "";
		
		for(i=0;i<3;i++){
			switch((int)(Math.random()*5)){
				case 0:
					figura = "corazones";
					break;
				case 1:
					figura = "diamante";
					break;
				case 2:
					figura = "herradura";
					break;
				case 3:
					figura = "campana";
					break;
				case 4:
					figura = "limón";
					break;
			}
			
			switch(i){
				case 0:
					dibujo1 = figura;
					break;
				case 1:
					dibujo2 = figura;
					break;
				case 2:
					dibujo3 = figura;
					break;
			}
		}
		System.out.print(dibujo1+" "+dibujo2+" "+dibujo3);
		System.out.println();
		if((dibujo1==dibujo2) && (dibujo1==dibujo3)){
			System.out.println("Enhorabuena, ha ganado 10 monedas");
		} else if ((dibujo1 != dibujo2) && (dibujo1!=dibujo3) && (dibujo2!=dibujo3)){
			System.out.println("Lo siento, ha perdido");
		} else {
			System.out.println("Bien, ha recuperado su moneda");
		}
		
	}
}


