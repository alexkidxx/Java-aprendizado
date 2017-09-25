package Testes;


public class Produto {
	
protected String nome;
protected int codigo;
protected double preco;

public Produto(String n, int c, double p) {

	this.nome = n;
	this.codigo = c;
	this.preco = p;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getCodigo() {
	return codigo;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + codigo;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produto other = (Produto) obj;
	if (codigo != other.codigo)
		return false;
	return true;
}

@Override
public String toString() {
	return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + "]";
}

}
