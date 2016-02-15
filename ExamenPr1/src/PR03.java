
public class PR03 {

	public static void main(String[] args) {// ----------------DECODIFICADOR----------------
		String mensaje="";
		String temporal="";
		String mensajeCodificado="APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";
		
		//for que recorre las letras en pares
		for (int i=0;i<mensajeCodificado.length();i+=2){
			//if que comprueba si estas en la penultima letra y ordena en funcion de si lo es o no
			if (i+1==mensajeCodificado.length()) {
				temporal= temporal + mensajeCodificado.charAt(i);
			}else{
				temporal = temporal + mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);
			}
		}
		//Pasamos todo a minuscula, asignamos e imprimimos
		temporal = temporal.toLowerCase();
		mensaje=temporal;
		System.out.println(mensaje);
		

	}

}
