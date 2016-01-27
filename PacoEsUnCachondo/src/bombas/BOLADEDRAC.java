package bombas;

public class BOLADEDRAC {

	static String frase="";//palabra ordenada en mayus
	static String abecedario ="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
	static String codificada="SDFRCHVCXQCFDFKRQGR";
	static int desplazamiento=3;
	static int posicion_abecedario;
	public static void main(String[] args) {
		for(int i=0;i<codificada.length();i++){
			for(int n=0;i<abecedario.length();n++){
				System.out.print(posicion_abecedario);
				System.out.print(abecedario.charAt(n));
				System.out.println("");
				if (codificada.charAt(i)==abecedario.charAt(n))posicion_abecedario=n;//tengo el indice
				if (posicion_abecedario<0) posicion_abecedario = (abecedario.length() + posicion_abecedario);
			}
			frase += abecedario.charAt(posicion_abecedario-3);
		}
		System.out.println(frase);
	}

}
