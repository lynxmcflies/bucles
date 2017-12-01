public class Ejercicio15 {
	public static void main (String[] args){
		int i = 0;
		int x = 1;
		int grupos = (int)((Math.random()*7)+1);
		String primeraNota = "";
		String nota = "";
		
		for(x=1;x<=grupos;x++){
			for (i=0;i<4;i++){
				switch ((int)((Math.random()*7)+1)){
					case 1:
						nota = "do ";
						break;
					case 2:
						nota = "re ";
						break;
					case 3:
						nota = "mi ";
						break;
					case 4:
						nota = "fa ";
						break;
					case 5:
						nota = "sol ";
						break;
					case 6:
						nota = "la ";
						break;
					case 7:
						nota = "si ";
						break;
				}
				if ((x==1) && (i==0)){
					primeraNota = nota;
				}
				if ((x==grupos) && (i==3)){
					System.out.print(primeraNota);
				} else {
					System.out.print(nota+" ");
				}
			} System.out.print("| ");
		} System.out.print("|");
		
	}
}


