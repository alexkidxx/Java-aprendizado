/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex-vostro
 */
class Usuario {

    private String login;
    private String nome;
    private int ponto;


    public Usuario(String login, String nome, int ponto) {

        this.login = login;
        this.nome = nome;
        this.ponto = ponto;

    }

    Usuario() {

    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public int getPonto() {
        return ponto;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    @Override
    public String toString() {

        return "Nome: " + nome + " Login: " + login + " Pontos: " + ponto;
    }



}
