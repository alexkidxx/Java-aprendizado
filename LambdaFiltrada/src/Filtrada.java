		
		
		
		import java.util.Collection;
		import java.util.List;
		import java.util.stream.Collectors;
public class Filtrada {
	 private static List<Pessoa> listPessoas;
	public static void main(String[] args) {


			
			
			  System.out.println("Pessoas com mais de 30 anos:");
			 
			List<Pessoa> maioresTrinta = listPessoas.stream().filter(p -> p.getIdade() > 30).collect(Collectors.toList());
			  maioresTrinta.forEach(p -> System.out.println(p.getNome()));
			       
			  System.out.println("Pessoas que o nome iniciam com E:");
			  List<Pessoa> nomesIniciadosE = listPessoas.stream().filter(p -> ((String) p.getNome()).startsWith("E")).collect(Collectors.toList());
			  nomesIniciadosE.forEach(p -> System.out.println(p.getNome()));	

	


	}

}
