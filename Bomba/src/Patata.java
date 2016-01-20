
public class Patata {

	static String asdf = "P.U.T.A.Dam";
	static char [] fdsa = new char [asdf.length()];
	static int [][] fdsatyu = new int [asdf.length()+1][asdf.length()+1];
	
	public static void main(String[] args) { 
		for(int i=0;i<asdf.length();i++){
			fdsa[i] = asdf.charAt(i);//coge una a una las letras de asdf y las asigna al array fdsa
			fdsatyu[i][0] = fdsa[i];//convierte las letras de fdsa en numeros del array fdsatyu(ASCII)
		}
		
		for (int i=0;i<asdf.length();i++){
			if (i+1<asdf.length())//if para que i no se salga del limite del array
				fdsatyu[i][0] = fdsatyu[i+1][0];//desordenacion de caracteres
			System.out.print(fdsatyu[i][0]+".");//Systems para imprimir la frase(aun mas desordenada)
			System.out.println("");
			System.out.print(fdsatyu[i][0]+fdsatyu[i+1][0]+".");
		}
	}
			
}
