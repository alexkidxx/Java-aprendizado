//Alexsandro Martins
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente p1 = new Paciente(64.23,1.96);
		Paciente p2 = new Paciente(80.0,1.80);
		Paciente p3 = new Paciente(123.12,1.75);
		
		p1.calcularIMC();
		System.out.println(p1.imc);
		
		p2.calcularIMC();
		System.out.println(p2.imc);
		
		p3.calcularIMC();
		System.out.println(p3.imc);
		
		System.out.println(p1.diagnostico());
		System.out.println(p2.diagnostico());
		System.out.println(p3.diagnostico());
	
		

		
		
		
		
		
		
		
		
		
	}

}
