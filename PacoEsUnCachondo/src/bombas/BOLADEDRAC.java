package bombas;

public class BOLADEDRAC {

	static String frase="";//palabra ordenada en mayus
	static String abecedario ="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
	static String codificada= "SDFRCHVCXQCFDFKRQGR";
	static int desplazamiento=3;
	static int posicion_abecedario;
	public static void main(String[] args) {
		System.out.println(codificada);
		
		for(int i=0;i<codificada.length();i++){
			for(int n=0;n<abecedario.length();n++){
				if (codificada.charAt(i)==abecedario.charAt(n)) posicion_abecedario=n-3;//tengo el indice
				if (posicion_abecedario<0) posicion_abecedario = (posicion_abecedario + abecedario.length());
			}
			frase += abecedario.charAt(posicion_abecedario);
		}
		System.out.println(frase);
	}

}
