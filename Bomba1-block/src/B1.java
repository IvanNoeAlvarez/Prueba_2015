
public class B1 {

static String frase = "PACO ME PONE MUCHISIMO";//palabra original
static String fraseCodificada="";//para codificar la palabra
static String solucion="";
static String substitutoVOCAL_A="@";//para sustituir la vocal A
int i=0;
	public static void main(String[] args) {
		frase = frase.replace("A", substitutoVOCAL_A);
		for(int i=0;i<frase.length();i=i+2){
			fraseCodificada = fraseCodificada+frase.charAt(i+1)+frase.charAt(i);
		}
		System.out.println(fraseCodificada);
descifrar();
	System.out.println(solucion);
	}

	public static void descifrar(){
		for (int x=0;x<fraseCodificada.length();x=x+2){
			solucion = solucion + fraseCodificada.charAt(x+1) + fraseCodificada.charAt(x);			
			} 
		solucion = solucion.replace(substitutoVOCAL_A, "A");
	int a = 99999999;
	int b = 55555555;
	System.out.println(a*b);
	
	}
		
	}

