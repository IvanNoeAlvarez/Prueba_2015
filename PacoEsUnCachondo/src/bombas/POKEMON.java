package bombas;

public class POKEMON {
	static String fraseCodificada = "Paco@es@un c1ch4nd4";
	static char letra;
	static String fraseOriginal="";
	public static void main(String[] args) {
		System.out.println(fraseCodificada);
		for (int i=0;i<fraseCodificada.length();i++){
			letra = fraseCodificada.charAt(i);
			switch(letra){
			case '@': fraseOriginal+= " ";
				break;
			case '1': fraseOriginal+= "a";
				break;
			case'4': fraseOriginal+= "o";
				break;
			default: fraseOriginal+=fraseCodificada.charAt(i);
				break;
			}
		}
		System.out.println(fraseOriginal);
	}

}
