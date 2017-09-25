
public class Respeitoso implements FormatadorNome{

	private char sexo; 
		
		
		public Respeitoso(char s) {
			this.sexo = s;
		}	

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if((sexo == 'F')||(sexo == 'f')){
			return "Sra. " + sobrenome;
		}else if((sexo == 'M')||(sexo == 'm')){
			return "Sr. " + sobrenome;
		}else return null;
		
	}

}
