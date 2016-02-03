
public class B2 {

	static char[] abecedario={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	static String[]numeros={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"};
	public static void main(String[] args) {
		String frase="";
		String fraseCodificada="17 1 3 16 / 26 / 17 1 2 12 16 / 21 5 / 5 14 23 9 1 14 / 20 1 12 22 4 16 20";
		String []numeroSolo={"17","1","3","16","/","26","/","17","1","2","12","16","/","21","5","/","5","14","23","9","1","14","/","20","1","12","22","4","16","20"};
		
		for(int i=0;i<numeroSolo.length;i++){
			
			for (int j=0;j<numeros.length;j++){
				if(numeros[j].equals(numeroSolo[i])){
					frase += abecedario[j];
				}
			}
			if (numeroSolo[i].equals("/")) frase+=" ";
			
		}
		
		//Paco y pablo te envian saludos
		
		System.out.println(frase);
	}
}