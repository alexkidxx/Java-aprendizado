

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex-vostro
 */

class Livro {

    private String titulo;
    private String categoria;
    private int quantidadePagina;
    private int id;

    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Livro(String titulo, String categoria, int quantidadePagina) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.quantidadePagina = quantidadePagina;
    }

   

    public Livro() {
		// TODO Auto-generated constructor stub
	}



	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String conteudo) {
        this.categoria = conteudo;
    }

   
    public int getQuantidadePagina() {
        return quantidadePagina;
    }

    public void setQuantidadePagina(int quantidadePagina) {
        this.quantidadePagina = quantidadePagina;
    }

    @Override
    public String toString() {

        return titulo;
    }

}
