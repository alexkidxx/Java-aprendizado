//Alexsandro Martins
public class Paciente {
	
	double peso;
	double altura;
	double imc;
	
	
public Paciente(double p,double a){
		this.peso = p;
		this.altura = a;
	}	
	
public void calcularIMC(){
	double indice = 0;
	indice = peso / (altura * altura);
	this.imc=indice;
	
	}


public String diagnostico(){
Double imc = this.imc;
	String s = null;
	if(imc < 16)
		s="Baixo peso muito grave = IMC abaixo de 16 kg/m²";
	else if(imc > 16 && imc < 16.99)
		s="Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
	else if(imc >= 17 && imc <= 18.49)
		s="Baixo peso = IMC entre 17 e 18,49 kg/m²";
	else if(imc >= 18.50 && imc <= 24.99)
		s="Peso normal = IMC entre 18.50 e 24,99 kg/m²";
	else if(imc >= 25 && imc <= 29.99)
		s="Sobrepeso = IMC entre 25 e 29,99 kg/m²";
	else if(imc >= 30 && imc <= 34.99)
		s="Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
	else if(imc >= 35 && imc <= 39.99)
		s="Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
	else if(imc > 40)
		s="Obesidade grau III (Obesidade morbida) = IMC acima de 40 kg/m²";
	
	return s;
	
			
}			
}
