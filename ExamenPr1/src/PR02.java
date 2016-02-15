
public class PR02 {

	public static void main(String[] args) {
		// preparación de los Strings
		String mensaje = "Paquito es el tio mas guapo que conozco";																								//Y un faker
		String mensajeCodificado = "";
		String temporal = "";

		// Pasamos todo a mayusculas
		mensaje.toUpperCase();

		//mientras la longitud de mensajeCodficado sea mayor que i... ...i=i+2
		for (int i=0;i<mensajeCodificado.length();i+=2) {
			//si la longitud de mensajeCodficado es igual que i+1...
			if (i + 1 == mensajeCodificado.length()) {
				//añade a temporal la letra en la posicion i de mensajeCodficado
				temporal += mensajeCodificado.charAt(i);
				//...si no es igual que i+1
			} else {
				//añade a temporal la letra en la posicion i+1 de mensajeCodficado y la de la posicion i
				temporal += mensajeCodificado.charAt(i + 1) + mensajeCodificado.charAt(i);
			}
		}
		//asignacion final e impresion
		mensajeCodificado=temporal;
		System.out.println(mensajeCodificado);
	}

}
