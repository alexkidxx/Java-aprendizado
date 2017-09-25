import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CamelCase {	
	
	private static String palavra;

	public static void setPalavra(String s) {
	palavra = s;
			
	}

	public static String getPalavra() {
		
		return palavra;
	}

	public static boolean isMaiusculo(char testUper) {
		int comparaTestUper = testUper;							//recebe o ascii do char de parâmetro
		int testUperGrande = Character.toUpperCase(testUper);	//recebe o ascii do char convertido para maiusculo
		 if(comparaTestUper==testUperGrande)
		return true;
			return false;
	}

	public static char getPrimeiroChar() {
		
		char[] charArray = palavra.toCharArray();
		return charArray[0];
	}
	public static boolean isNumero(char c){
		int cod =c;
		if(cod >= 48 && cod <=57)
			return true;
				return false;
	}
	
	public static boolean isValido(char c) {
		int cod = c;
		int cod2 = CamelCase.getPrimeiroChar();
		
		if(cod >= 48 && cod <=57 &&  cod != cod2 || cod >=65 && cod <=90 || cod >=97 && cod <= 122)
		return true;
			return false;
	}

	public static boolean isPalavraValida() {
		int todosOk=0;	
		boolean retorno;
		char[] charArray = CamelCase.getPalavra().toCharArray();
		for(int i=0;i<charArray.length;i++){
		if(isValido(charArray[i]))
		todosOk++;
		}		
		if(todosOk==charArray.length)
			return true;
			return false;
		}

	public static List<String> converterCamelCase(String original) {
		int ultimoCorte=0;
		ArrayList<String> s = new ArrayList();
		 original = CamelCase.getPalavra();
		char[] charArray = CamelCase.getPalavra().toCharArray();
		for(int i=1;i<charArray.length;i++){			
			if(isMaiusculo(charArray[i])){
				s.add(original.substring(ultimoCorte, i));
				ultimoCorte=i;
			}}
			s.add(original.substring(ultimoCorte, charArray.length));
		return CamelCase.normalise(s);
		
	}
	
	private static List<String> normalise(ArrayList<String> s) {
		String dochar = "a ";
		ArrayList<String> retorno = new ArrayList();
		char[] charArray=dochar.toCharArray();
		int indice=0;	
		for(Iterator<String> i = s.iterator(); i.hasNext(); ) {
		    String item = i.next();
		     if(item.length()>1){			
			retorno.add(item);
			}
			else{
			charArray[indice]=item.charAt(0);
			indice++;	
			if(indice==2)
			retorno.add(String.valueOf(charArray));
			}			
		}
				
		return retorno;
	}

	

	
	
}	
	