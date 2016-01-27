package bombas;

public class DORAEMON {
	static String frase ="PaCo es un CaChondo";
	public static void main(String[] args) {
		System.out.println(frase);
		frase = frase.replaceAll("C", "c");
		System.out.println(frase);
	}

}
