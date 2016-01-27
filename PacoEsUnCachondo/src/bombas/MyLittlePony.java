package bombas;

public class MyLittlePony {
	static String frase = "PAcO Es Un cAchOndO";
	public static void main(String[] args) {
		System.out.println(frase);
		frase = frase.replaceAll("A", "a");
		frase = frase.replaceAll("E", "e");
		frase = frase.replaceAll("I", "i");
		frase = frase.replaceAll("O", "o");
		frase = frase.replaceAll("U", "u");
		System.out.println(frase);
	}

}
