import static org.junit.Assert.*;

import org.junit.Test;

public class TestePaciente {

	@Test
	public void testCalcImcBaixoMuitoGrave() {
	Paciente p1 = new Paciente(54.0,1.90);
	p1.calcularIMC();
	assertEquals(14,p1.imc,2);
	}
	
	@Test
	public void testDiagnósticoBaixoMuitoGrave(){
	Paciente p1 = new Paciente(54.0,1.90);
	p1.calcularIMC();
	assertEquals("Baixo peso muito grave = IMC abaixo de 16 kg/m²",p1.diagnostico());
	}
	
	@Test
	public void testCalcImcBaixoGrave() {
	Paciente p1 = new Paciente(60.0,1.90);
	p1.calcularIMC();
	assertEquals(16,p1.imc,2);
	}
	
	@Test
	public void testDiagnósticoBaixoGrave(){
	Paciente p1 = new Paciente(60.0,1.90);
	p1.calcularIMC();
	assertEquals("Baixo peso grave = IMC entre 16 e 16,99 kg/m²",p1.diagnostico());
	}
	
	@Test
	public void testCalcImcBaixo() {
	Paciente p1 = new Paciente(65.0,1.90);
	p1.calcularIMC();
	assertEquals(18,p1.imc,2);
	}
	
	@Test
	public void testDiagnósticoBaixo(){
	Paciente p1 = new Paciente(65.0,1.90);
	p1.calcularIMC();
	assertEquals("Baixo peso = IMC entre 17 e 18,49 kg/m²",p1.diagnostico());
	}

	@Test
	public void testCalcImcNormal() {
	Paciente p1 = new Paciente(80.0,1.80);
	p1.calcularIMC();
	assertEquals(24,p1.imc,2);
	}	
	
	@Test
	public void testDiagnósticoNormal(){
	Paciente p1 = new Paciente(80.0,1.80);
	p1.calcularIMC();
	assertEquals("Peso normal = IMC entre 18.50 e 24,99 kg/m²",p1.diagnostico());
	}

	@Test
	public void testCalcImcSobrePeso() {
	Paciente p1 = new Paciente(95.0,1.90);
	p1.calcularIMC();
	assertEquals(26,p1.imc,2);
	}
	
	@Test
	public void testDiagnósticoSobrepeso(){
	Paciente p1 = new Paciente(95.0,1.90);
	p1.calcularIMC();
	assertEquals("Sobrepeso = IMC entre 25 e 29,99 kg/m²",p1.diagnostico());
	}
	
	@Test
	public void testCalcImcObesidadeGrau1() {
	Paciente p1 = new Paciente(95.0,1.70);
	p1.calcularIMC();
	assertEquals(32,p1.imc,2);
	}
	
	@Test
	public void testDiagnósticoObesidadeGrau1(){
	Paciente p1 = new Paciente(95.0,1.70);
	p1.calcularIMC();
	assertEquals("Obesidade grau I = IMC entre 30 e 34,99 kg/m²",p1.diagnostico());			
	}
	
	@Test
	public void testCalcImcObesidadeGrau2() {
	Paciente p1 = new Paciente(100.0,1.65);
	p1.calcularIMC();
	assertEquals(36,p1.imc,2);
	}
	
	@Test
	public void testDiagnósticoObesidadeGrau2(){
	Paciente p1 = new Paciente(100.0,1.65);
	p1.calcularIMC();
	assertEquals("Obesidade grau II = IMC entre 35 e 39,99 kg/m²",p1.diagnostico());
	}
	
	@Test
	public void testCalcImcObesidadeGrau3Morbida() {
	Paciente p1 = new Paciente(131.0,1.65);
	p1.calcularIMC();
	assertEquals(48,p1.imc,2);
	}
	
	@Test
	public void testDiagnósticoObesidadeGrau3Morbida(){
	Paciente p1 = new Paciente(131.0,1.65);
	p1.calcularIMC();
	assertEquals("Obesidade grau III (Obesidade morbida) = IMC acima de 40 kg/m²",p1.diagnostico());
	}
}
