package aula01;
import java.util.Scanner;

public class P1_1 {
	final static Scanner kb = new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		System.out.print("Por favor introduza uma frase: ");
		String frase = kb.nextLine();
		
		System.out.println("Total de carateres numéricos: "+countNum(frase));
		System.out.println("Só minúsculas " +countMin(frase));
		System.out.println("Só maiúsculas " +countMax(frase));
		System.out.println("Total de palavras lidas: " +totalWords(frase).length);
		System.out.println("Nova string: "+change(frase));
		
	}
	
	public static int countNum(String frase){
		int tmp = 0; 
		for (int i = 0; i < frase.length(); i++) {
			if(Character.isDigit(frase.charAt(i))) tmp++;
		}
		return tmp;
	}
	
	public static boolean countMin(String frase) {
        return frase.equals(frase.toLowerCase());
    }
	
	public static boolean countMax(String frase) {
        return frase.equals(frase.toUpperCase());
    }
	
	// não esquecer pal = s.split("\\s+")
	public static String[] totalWords(String frase){
		return frase.split("\\s+");
	}
	
	//para concatenar: usar string vazia ir adicionando novos carateres com operador +
	public static String change(String frase){
		String s = "";
		char c = ' ';
		
			for (int i = 0; i < frase.length(); i++) {
				if(i % 2 == 0){
					c = frase.charAt(i);
				}else{
					s += Character.toString(frase.charAt(i)) + Character.toString(c);
					c = ' ';
				}
			}
			if(c != ' ')
				s += c;
		return s;
	}
}